package org.example;

import java.util.Scanner;

public class EmployeeEmail {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLength = 12;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity = 5000;
    private String company = "fluj.com";

    //Create constructor
    public EmployeeEmail(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
        //System.out.println("Department is: " + this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        //System.out.println("Your password is: " + this.password);

        //call a method that returns an email address
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + company;
//        this.alternateEmail = generateEmail();
        //System.out.println("Your email address is: " + this.email);
    }


    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 For Sales\n2 For Development\n3 For Accounting\n4 For None\n Enter your department code: ");
        Scanner in = new Scanner(System.in);
        //Take in user input and assign value to a variable
        //in.nextInt();
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "Sales";
        } else if (deptChoice == 2) {
            return "Dev";
        } else if (deptChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
    }

        //Generate email

//        private String generateEmail(String firstName, String lastName, int mailboxCapacity) {
//            if (firstName == "true" && lastName == "true") {
//
//                return (this.firstName + "." + this.lastName + "@" + this.department + " .company.com");
//            }
//            return null;
//        }
        //Generate random password
        private String randomPassword(int length) {
            String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
            char[] password = new char[length];
            for (int i = 0; i < length; i++) {
                int issue = (int) (Math.random() * passwordSet.length());
                password[i] = passwordSet.charAt(issue);
                //System.out.println(issue);
                //System.out.println(passwordSet.charAt(issue));
            }
            return new String(password);
        }

        //Set and get mailbox capacity

    public void setMailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;
    }

    public int getMailBoxCapacity() {
        return mailboxCapacity;
    }


    //Set and get alternate email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
        //Change password
    public void changePassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String displayInfo() {
        return "Your info is: " + firstName + " " + lastName +
                "\nPassword: " + password +
                "\nemail address: " + email +
                "\nmailbox capacity is: " + mailboxCapacity + "MB" +
                "\nalternate email: " + alternateEmail;

    }

}


