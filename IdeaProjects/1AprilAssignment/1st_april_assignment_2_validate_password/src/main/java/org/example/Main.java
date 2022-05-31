package org.example;

import java.util.Scanner;

import static org.example.UserMainCode.checkPassword;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your password: ");
        String str=scanner.next();
        boolean flag= checkPassword(str);
        if(flag)
            System.out.print("Valid Password");
        else
            System.out.print("Invalid Password");

    }

}