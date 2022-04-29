package com.company;

import java.util.Scanner;

public class Main {

    private static System system;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your first name? ");
        String firstName = scanner.nextLine();

        String str1 = new String(firstName);
        int str2 = str1.length();
        System.out.println(" Your Name Has " + str2 + " letters");


        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.println("You've lived " + age + " years." + " In another " + age + " you'll be " + age * 2 + "!" + " You'll be old " + firstName + "!");

        System.out.println("Bill Splitter 3000");

        System.out.print("Total plus Tip on Bill: $");
        double billTotal = scanner.nextDouble();

        System.out.println("How many in party?");
        Double party = scanner.nextDouble();


        System.out.println("Each person must pay a total of " + billTotal / party + " in order to leave!");


        System.out.print("Amount of money in your pocket: $");
        double money = scanner.nextDouble();

        System.out.println();

        Double moneyNeeded = Math.ceil(billTotal / party) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.format(" you have $%.2f on you and need $%.2f. In what world did you think you could afford this resturant?", money, moneyNeeded);
    }
}
