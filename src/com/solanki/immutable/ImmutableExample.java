package com.solanki.immutable;

import com.solanki.serial.and.deseriali.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableExample {
    final List<Employee> employeesList;
    final Address address;
    final int sid;

    public ImmutableExample(int sid, List<Employee> employeesList, Address address) {
        this.sid = sid;
        this.employeesList = employeesList;
        this.address = address;
    }

    public int getSid() {
        return sid;
    }

    public List<Employee> getEmployeesList() {
        return Collections.unmodifiableList(employeesList);
    }

    public Address getAddress() {
        // return address.clone();
        return address;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(101, "Ashish");
        Employee employee1 = new Employee(102, "Ashish");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        Address address = new Address(1, "bellendur");
        ImmutableExample immutableExample = new ImmutableExample(101,employees, address);
        System.out.println(immutableExample.getSid());
        List<Employee> employeeList = immutableExample.getEmployeesList();
        for(Employee employee2 : employeeList){
            employee2.setEid(105);
            System.out.println(employee2.getEid());
        }
//    immutableExample.sid = 103;
    }
}
