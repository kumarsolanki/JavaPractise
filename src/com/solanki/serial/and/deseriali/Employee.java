package com.solanki.serial.and.deseriali;

import java.io.*;

public class Employee implements Serializable {

    private transient int eid;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    private String ename;

    private void readObject(ObjectOutputStream objectOutputStream) throws Exception {
        objectOutputStream.defaultWriteObject();
        int eidStream = eid + 38439;
        objectOutputStream.writeObject(eidStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws Exception {

        objectInputStream.defaultReadObject();
        int ediStream = (int) objectInputStream.readObject();
        eid = ediStream - 3849;

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee(101, "ashish");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("emp.txt")));
        objectOutputStream.writeObject(employee);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("emp.txt")));
        Employee employee1 = (Employee) objectInputStream.readObject();
        System.out.println(employee1.getEid());
    }
}
