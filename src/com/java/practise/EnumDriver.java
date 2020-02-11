package com.java.practise;

import java.util.TreeMap;

public class EnumDriver {
    DayEnum dayEnum;

    public EnumDriver(DayEnum dayEnum) {
        this.dayEnum = dayEnum;
    }

    static void printDay(DayEnum dayEnum) {
        switch (dayEnum) {
            case MONDAY:
                System.out.println("Mondays are bad   " + dayEnum.ordinal());
                break;
            case TUESDAY:
                System.out.println(dayEnum + "  are bad  " + dayEnum.ordinal());
                break;
            case WEDNESDAY:
                System.out.println(dayEnum + "  are bad  " + dayEnum.ordinal());
                break;
            case THURSDAY:
                System.out.println(dayEnum + "  are bad  " + dayEnum.ordinal());
                break;
            case FRIDAY:
                System.out.println(dayEnum + "  are bad  " + dayEnum.ordinal());
                break;
            case SATURDAY:
                System.out.println(dayEnum + "  ready for  Horrah  " + dayEnum.ordinal());
                break;
            case SUNDAY:
                System.out.println(dayEnum + "  are Horrah  " + dayEnum.ordinal());
                break;
            default:
                System.out.println("day are not good");
                break;
        }
    }

    public static void main(String[] args) {

        TreeMap<String, String> stringStringTreeMap = new TreeMap<>();
        System.out.println(DayEnum.MONDAY);
        for (DayEnum day : DayEnum.values()) {
            System.out.println(day + " - " + day.ordinal());
            System.out.println(day.valueOf("SUNDAY"));
        }

        DayEnum day = DayEnum.MONDAY;
        System.out.println(day);
        EmployeeType employeeType = EmployeeType.PERMANENT;
        System.out.println(employeeType);
        System.out.println(EmployeeType.PERMANENT + "  -  " + EmployeeType.PERMANENT.ordinal());
        for (EmployeeType employeeType1 : EmployeeType.values()) {
            System.out.println(employeeType + " --- " + employeeType1.ordinal());
        }

        EnumDriver enumDriver = new EnumDriver(DayEnum.MONDAY);
        enumDriver.printDay(DayEnum.SATURDAY);
        System.out.println(DayEnum.SATURDAY.toString());
        System.out.println(EmployeeType.PERMANENT.getValue());
    }

    enum EmployeeType {
        PERMANENT, CONTRACT;

        private String value;

        private EmployeeType(String s) {
            this.value = s;
        }

        EmployeeType() {

        }

        public String getValue(){
            return value;
        }

    }
}
