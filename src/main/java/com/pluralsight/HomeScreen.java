package com.pluralsight;
//With this application you can track all financial transactions for a
//business or for personal use

//import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeScreen {
    public static void main(String[] args) throws IOException {
//tasks:
//• Home Screen
// Add Scanner
        Scanner scanner = new Scanner(System.in);
       // FileWriter writer = new FileWriter("transactions.csv");

// The home screen should give the user the following options.
//▪ D) Add Deposit - prompt user for the deposit information and save it
//        to the csv file
        System.out.println("{ D } Add Deposit");
        //need a method to take info, write it to a file and then display confirmation and ask what to do next
        // create a
//▪ P) Make Payment (Debit) - prompt user for the debit information
//        and save it to the csv file
        System.out.println("{ P } Make Payment");

//▪ L) Ledger - display the ledger screen
        System.out.println("{ L } Ledger");

//▪ X) Exit - exit the application
        System.out.println("{ X } Exit ");
//     The application should continue to run until the user chooses to exit.
//need a loop here




    }//end of main

}//end of public class
