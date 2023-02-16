package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String alternateEmail;
    private String companydomain = "bambal.co";
    private String email;
    private String department;
    private int mailboxCapacity = 500;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created : " + firstName + " " +  lastName);

        //method for department
        this.department = setDepartment();
        //System.out.println("Department is : " + this.department);

        //method for random password
        this.password = setPassword(8);
        System.out.println("Password : " + password);

        //generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companydomain;
        System.out.println("Email : " + email);

    }

    private String setDepartment(){
        System.out.println("Enter department: \n1 for Sales\n2 for Dev\n" +
                "3 for Accounts\n0 for None\nEnter code here: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1) {return "sales";}
        else if(depChoice == 2) {return "dev";}
        else if(depChoice == 3) {return "accounts";}
        else {return " ";}
    }

    private String setPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#.";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //set alt email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
}
