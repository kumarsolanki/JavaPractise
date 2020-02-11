package com.solanki.ExceptionHandling;

import com.solanki.serial.and.deseriali.Employee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ExceptionExample1 {


    public static int checkReturn() {
        try {
            int a = 800;
            if (a > 100)
                throw new InvalidEmployeeIDException("Inavlid Id..");
            System.out.println("Inside try..");
            return 10;
        } catch (Exception e) {
            e.printStackTrace();
            return 20;
        } finally {
            System.out.println("Inside finally..");
            return 70;
        }
//        return 80;
    }

    public static void checkException() throws InvalidEmployeeIDException {

        Employee employee = new Employee(101, "ashish");
        if (employee.getEid() < 110) throw new InvalidEmployeeIDException("Invalid Employee number");
        try {
            File file = new File("test.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InvalidEmployeeIDException {
        ExceptionExample1 exceptionExample1 = new ExceptionExample1();
//        exceptionExample1.checkException();
        System.out.println(ExceptionExample1.checkReturn());
    }
}
