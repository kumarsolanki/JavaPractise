package com.solanki.serial.and.deseriali;

import java.io.*;

public class Student implements Externalizable {

    private int sid;
    private  String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(sid);
        out.writeObject(sname);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int sid = (int) in.readObject();
        System.out.println("readInt"+in.readObject());

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("student.txt")));
        Student student = new Student();
        student.setSid(101);
        student.setSname("kumar");
        objectOutputStream.writeObject(student);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("student.txt")));
        Student student1 = (Student) objectInputStream.readObject();
        System.out.println(student1.getSid());

    }
}
