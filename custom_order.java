// Code for Beginning Java's Cake & Cupcake Shop Tutorial

import java.util.Scanner;  // Needed for the Scanner class to read input

public class custom_order {


    // STEP 1 PRINTING HELLO WORLD TO CONSOLE
    public static void main(String[] args) {
        
      try (Scanner keyboard = new Scanner (System.in)) {
        System.out.println("Welcome to Java's Cake & Cupcake Shop!");
        System.out.println("We make custom cakes with our secret cake batter!");

        String firstName; // User's first name
        firstName = keyboard.nextLine();
        System.out.printf("Whats your name? %s ", firstName);
        System.out.println("Whats your order?");
        String itemOrder; // Item ordered
        itemOrder = keyboard.nextLine();
        System.out.printf("Your order coming up: %s ", itemOrder);
        System.out.println("What frosting you want?");
        String frostingType; // Frosting ordered
        frostingType = keyboard.nextLine();
        System.out.println("Choose a topping!");
        String fillingType; // Filling ordered
        fillingType = keyboard.nextLine();
        System.out.println("And topping?");
        String toppings; // Toppings ordered
        toppings = keyboard.nextLine();
        System.out.printf("Your name %s, and order %s, frosttype %s, filling %s, topping %s ", firstName, itemOrder, frostingType, fillingType, toppings);
      }catch (Exception e) {
        System.out.println("Wrong input");
      }

      double cost = 15.00; // Cost of cake and cupcakes
      System.out.println(cost);
      final double TAX_RATE = .08;  // Sales tax rate
      System.out.println(TAX_RATE);
      double tax = 6; // Amount of tax
      System.out.println(tax);
  
    }   
}