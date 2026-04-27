package com.pluralsight;

import java.util.Scanner;

public class Ledger {

    public static void addDeposit (Scanner scanner){
        // 1. collect information
        // date = LocalDate.now()
        System.out.println("Enter date [dd/mm/yy] :");
        String date =  scanner.nextLine();

// time = LocalTime.now()
        System.out.println("Enter time [hh/mm/ss] :");
        String time = scanner.nextLine();
// ask description
        System.out.println("Enter description");
        String description = scanner.nextLine();

// ask vendor
        System.out.println("Enter Vendor");
        String vendor = scanner.nextLine();

// ask amount
        System.out.println("Enter amount:");
        double amount = scanner.nextDouble();
//remember to add buffer after double
        scanner.nextLine();
// 2. show confirmation message
        System.out.println("does this look correct? Y/N");
        boolean isCorrect = scanner.hasNext();

// 3. if yes make this a loop
        boolean b = isCorrect == true;
        if(isCorrect){
        }
// create transaction
// write transaction to csv
// show success message

// 4. if no
// return to menu OR restart the method


} //end of void


}//end of class
