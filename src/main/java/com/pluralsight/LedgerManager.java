package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LedgerManager {

    public static void writeTransaction(Transaction t) throws IOException {
        //add file writer

        //create method inside try/catch to write to csv file
        FileWriter writer = new FileWriter("transactions.csv", true);

        //add variable to store line
        String line = t.getDate() + "|" +
                t.getTime() + "|" +
                t.getDescription() + "|" +
                t.getVendor() + "|" +
                t.getAmount() + "\n";
        // have writer put the line together and close after
        writer.write(line);

        writer.close();

    }//END OF WRITE TRANSACTION

    public static void addDeposit(Scanner scanner) throws IOException {
        System.out.println("──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──");
        System.out.println("    /)/)           (\\(\\");
        System.out.println("   ( . .)          (ᵔ ᵔ ) ✧ recording new blessing to coffers ✧");
        System.out.println("   o( づ ˚₊‧꒰ა $ ໒꒱ ‧₊˚⊂  )o");
        System.out.println("──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──\n");
        // 1. collect information

        // date
        System.out.println("˚₊‧꒰ა when was blessing given? ໒꒱ ‧₊˚ :(YYYY/MM/DD)");
        String date = scanner.nextLine();

        // time
        System.out.println("˚₊‧꒰ა enter time of receipt ໒꒱ ‧₊˚");
        String time = scanner.nextLine();
        // ask description
        System.out.print("˚₊‧꒰ა please describe this blessing ໒꒱ ‧₊˚  ");
        String description = scanner.nextLine();

        // ask vendor
        System.out.println("˚₊‧꒰ა identify merchant ໒꒱ ‧₊˚ ");
        String vendor = scanner.nextLine();

        // ask amount
        System.out.println("˚₊‧꒰ა enter coin amount");
        double amount = scanner.nextDouble();

        //remember to add buffer after double
        scanner.nextLine();

        // 2. show confirmation message
        System.out.println("     /)  /)");
        System.out.println("    (｡•ㅅ•｡)〝₎₎ New Payment! ꘩ ₊ ˊ˗ ");
        System.out.println(".   .╭∪─∪─────────────────────────────────────────────────────── \uD80C\uDEDC ⁺.");
        System.out.println(date + "|" + time + "|" + description + "|" + vendor + "|" + amount);
        System.out.println("     ╰──────────────────────────────────────────────────────────   \uD804\uDC65౿ ⁺.");


        // ask if correct
        System.out.println("does this look correct? Y/N");
        String confirm = scanner.nextLine();

        // 3. add if for confirmation
        if (confirm.equalsIgnoreCase("Y")) {

            // create transaction
            Transaction t = new Transaction(date, time, description, vendor, amount);

            // print confirmation
            System.out.println(amount+ " coins added to coffer!.ᐟˎˊ˗");

            // write transaction to csv (we add this next)
            writeTransaction(t);
        }

        //  if no
        else {
            System.out.println("Transaction cancelled.");
        }
        // after confirmed OR canceled
        System.out.println("\nPress Enter to return to main menu...");
        scanner.nextLine();
    } //end of addDeposit method
    // Create method for making payments

    public static void makePayment(Scanner scanner) throws IOException {
        //collect info on payments (same format as deposit but negative)
        System.out.println("──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──");
        System.out.println("      (\\(\\       (\\(\\");
        System.out.println("      (ᵔ ᵔ )    (. . ) ✧ recording new withdrawal from coffers ✧");
        System.out.println(" ꒰ა $ ໒꒱ ⊂ )o  ꒰  ꒱ ⊂ )o");
        System.out.println("──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──── ⋆⋅☆⋅⋆ ──");
        // 1. collect information again

        // date
        System.out.println("⋆⋅☆⋅⋆ ₊enter date of withdrawal [yyyy-mm-dd]⋆⋅☆⋅⋆ ");
        String date = scanner.nextLine();

        // time
        System.out.println("⋆⋅☆⋅⋆ enter time of withdrawal [hh:mm:ss] ⋆⋅☆⋅⋆ ");
        String time = scanner.nextLine();

        // ask description
        System.out.println("⋆⋅☆⋅⋆describe product attained⋆⋅☆⋅⋆ ");
        String description = scanner.nextLine();

        // ask vendor
        System.out.println("⋆⋅☆⋅⋆ enter Merchants name⋆⋅☆⋅⋆ ");
        String vendor = scanner.nextLine();

        // ask amount
        System.out.println("⋆⋅☆⋅⋆ enter amount of coins withdrawn⋆⋅☆⋅⋆ ");
        double amount = scanner.nextDouble();
        amount = -Math.abs(amount);

        //remember to add buffer after double
        scanner.nextLine();

        // 2. show confirmation message
        System.out.println("     /)  /)");
        System.out.println("    (｡•ㅅ•｡)〝₎₎ New Payment! ꘩ ₊ ˊ˗ ");
        System.out.println(".   .╭∪─∪─────────────────────────────────────────────────────── \uD80C\uDEDC ⁺.");
        System.out.println( date + "|" + time + "|" + description + "|" + vendor + "|" + amount);
        System.out.println("     ╰───────────────────────────────────────────────────────────  \uD804\uDC65౿ ⁺.");
        // ask if correct
        System.out.println("does this look correct? Y/N");
        String confirm = scanner.nextLine();

        // 3. if yes
        if (confirm.equalsIgnoreCase("Y")) {

            // create transaction
            Transaction t = new Transaction(date, time, description, vendor, amount);

            // print confirmation
            System.out.println("    ∧＿∧");
            System.out.println("   (｡･ω･｡)つ━☆・*。");
            System.out.println("  ⊂/　  /　   ・゜");
            System.out.println(" 　しーＪ　　　     °。+ * 。");
            System.out.println("                            .・゜");
            System.out.println("                 Payment confirmed.ᐟ⊹₊ ⋆");
            writeTransaction(t);
            System.out.println("done writing");
        }//end of if

        // 4. if no
        else {
            System.out.println("Payment cancelled. Returning to menu⋆⋅☆⋅⋆.");
        }
        // after confirmed OR canceled
        System.out.println("\nPress Enter to return to main menu...");
        scanner.nextLine();
    }


    // Make method for exit
    public static void confirmExit(Scanner scanner) {
        // ask for confirmation of exit
        System.out.println("Are you sure you want to exit? Y/N");
        String answer = scanner.nextLine();

        //create boolean if statement to assist exit
        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("Now exiting store..");
        } else
            System.out.println("\nPress Enter to return to home...");
    }
}//end of class
