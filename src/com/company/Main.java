package com.company;

//Calculator program that sums the cost of the items entered by the user. Accepts cost of items
//until the user enter 0.
//Displays the total cost of the items, the total cost of items with a 2.5 % of tax,
//asks user for tip percentage, display the amount of the tip and the grand total.
//The program uses number formatting to display amount with two decimal places and commas every 3 digits.
import java.util.Scanner;  //code to read the user input
import java.text.NumberFormat;  //code for number  formatting

public class Main {

    public static void main(String[] args) {
        //declare variables
        Scanner scanner = new Scanner(System.in);
        double itemCost = 0;
        double taxRate = 0.025;
        double taxAmount;
        double totalWithTax;
        double totalItemCost = 0;
        double tipAmount;
        double tipPercentage = 0;
        double totalAmount;
        String totalOut;


        System.out.println("Enter the cost of items you want to add or 0 when there is no more items.");
        System.out.println("Enter the cost of the item: ");
        itemCost = scanner.nextDouble();

        while (itemCost != 0) {

            totalItemCost += itemCost;  //adds the amounts entered by the user
            System.out.println("Enter the cost of the next item: ");
            itemCost = scanner.nextDouble(); //reads the amount entered by the user

        }

                System.out.println("Enter the tip percentage you want to add. A 17.5% tip is recommended.");
                System.out.println("Please enter the tip percentage:");
                tipPercentage = scanner.nextDouble();  //reads the tip percentage entered by the user

                tipPercentage = tipPercentage / 100; //to calculate the tip percentage
                taxAmount = taxRate * totalItemCost; //to calculate the tax amount
                totalWithTax = totalItemCost + taxAmount; //to calculate the sum of the items cost with tax
                tipAmount = tipPercentage * totalWithTax; //to calculate the tip amount
                totalAmount = totalWithTax + tipAmount; //to calculate the total amount with tip

                NumberFormat nf = NumberFormat.getNumberInstance();  //initialize numberformat
                nf.setGroupingUsed(true);  // to add commas every 3 digits
                nf.setMaximumFractionDigits(2);  //select the maximum number of decimal digits.
                nf.setMinimumFractionDigits(2);  //select the minimum number of decimal digits.

                totalOut = nf.format(totalItemCost);  //to round the total cost of items entered
                System.out.println("Total cost of items entered is: $ " + totalOut);
                totalOut = nf.format(taxAmount);  // to round the tax amount
                System.out.println("The Tax Amount of the items entered is: $ " + totalOut);
                totalOut = nf.format(totalWithTax);  //to round the total amount with tax
                System.out.println("Total cost of items entered with tax is: $ " + totalOut);
                totalOut = nf.format(tipAmount);  //to round the tip amount
                System.out.println("Tip Amount is: $ " + totalOut);
                totalOut = nf.format(totalAmount);  // to round the grand total
                System.out.println("The Grand Total is: $ " + totalOut);


    }//end of main

    }//end of class
