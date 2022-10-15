package org.example;

public class Main {
    public static void main(String[] args) {
        EmployeeEmail one = new EmployeeEmail ("Ansa", "Ekeng");

        one.setAlternateEmail("ansy@gmail.com");
        System.out.println(one.getAlternateEmail());

        System.out.println(one.displayInfo());
    }




}