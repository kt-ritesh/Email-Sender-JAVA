package org.ritesh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Ritesh Email Massage System.😊😊");
        System.out.print("Please Enter Receiver Email id: ");;
        MailMetaData.receiverEmail = sc.nextLine();

        System.out.print("Enter Your Email Subject : ");
        MailMetaData.Sub = sc.nextLine();
        System.out.print("Enter Your Message : ");;
        MailMetaData.mess = sc.nextLine();

        MailHandler mailhandler = new MailHandler();
        mailhandler.sendMail();
    }
}