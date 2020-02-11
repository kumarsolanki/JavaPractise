package com.java.practise;

public enum DayEnum {
    SUNDAY("001"), MONDAY("002"), TUESDAY("003"), WEDNESDAY("004"), THURSDAY("005"), FRIDAY("006"), SATURDAY("007");

    private String value;
   private DayEnum(String s) {
        System.out.println("Constructor called for : "+this.toString());
        this.value = s;
    }

    public String getValue(){
       return this.value;
    }
    public void getColor(){
        System.out.println("Universal color..");
    }

    public static void main(String[] args) {
        System.out.println("Program starts...");
        DayEnum dayEnum = DayEnum.MONDAY;
        System.out.println(dayEnum);
        dayEnum.getColor();
        System.out.println(dayEnum.getValue());
        System.out.println("Program ends.....");
    }
}
