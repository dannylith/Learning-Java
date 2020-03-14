/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class ConsoleApp {
    
    static Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        DisplayCrustOption();
        DisplaySauceOption();
        DisplayIngredientOptions();
        DisplayPizzaRecipe();
    }
    
    public static void DisplayCrustOption(){
        System.out.println("*********************************************************************");
        System.out.println("Please choose one crust options: ");
        System.out.printf("\n%-30s %s \n", "a. regular crust", "b. gluten-free crust");
        System.out.print("\nEnter chice: ");
        String input = stdin.nextLine();
        
        String choice = "";
        if(input.compareTo("a") == 0) choice = "a. regular crust = 1";
        if(input.compareTo("b") == 0) choice = "b. gluten-free crust = 1";
        System.out.println("* You chose:\t" + choice + " *");
    }
    
    public static void DisplaySauceOption(){
        System.out.println("*********************************************************************");
        System.out.println("\nPlase choose one sauce option:\n");
        System.out.printf("%-30s %s", "a. red sauce", "b. no red sauce");
        System.out.print("\n\nEnter choice: ");
        String input = stdin.nextLine();
        String choice = "";
        
        if(input.compareTo("a") == 0) input = "a. red sauce";
        if(input.compareTo("b") == 0) input = "b. no red sauce";
        
        System.out.println("Please choose one amount:\n");
        System.out.printf("%-30s %s", "a. 1/4 cup", "b. 1/2 cup");
        System.out.print("\n\nEnter choice: ");
        String input2 = stdin.nextLine();
        
        if(input2.compareTo("a") == 0) input2 = "1/4 cup";
        if(input2.compareTo("b") == 0) input2 = "1/2 cup";
        
        System.out.println("* You chose:\t" + input + " = " + input2 + " *");
        
    }
    
    public static void DisplayIngredientOptions(){
        System.out.println("*********************************************************************");
        System.out.println("\nPlase choose one sauce option:");
        
        System.out.printf("\n%-30s %-30s %s", 
                "a. pizza cheese", "b. diced onion", "c. diced green pepper");
        System.out.printf("\n%-30s %-30s %s", 
                "d. pepperoni", "e. sliced mushroom", "f. diced jalapenos");
        System.out.printf("\n%-30s %-30s %s", 
                "g. sardines", "h. pineapple chunks", "i. tofu");
        System.out.printf("\n%-30s %-30s %s", 
                "j. ham chunks", "k. dry red pepper", "l. dry basil");
        
        String input = GetIndredientChoice();
        
        System.out.println("\nPlease choose one amount: ");
        System.out.printf("\n%-30s %s", "a. 1/4 cup", "b. 1/2 cup");
        System.out.print("\n\nEnter choice: ");
        String input2 = stdin.nextLine();
        
        if(input2.compareTo("a") == 0) input2 = "1/4 cup";
        if(input2.compareTo("b") == 0) input2 = "1/2 cup";
        
        System.out.println("* You chose " + input + " = " + input2 + " *");
        
        System.out.println("*********************************************************************");
        System.out.println("Would you like to add another ingredient?");
        System.out.printf("\n%-30s %s", "a. continue", "b. finished");
        
        System.out.print("\n\nEnter choice: ");
        String input3 = stdin.nextLine();
    }
    
    public static void DisplayPizzaRecipe(){
        System.out.println("*********************************************************************");
        System.out.println("\n* Your pizza recipe *");
        
        String[] pizzaItem = new String[]{"regular crust", "red sauce", "pizza cheese", "pepperoni", "dry basil"};
        String[] pizzaItemQty = new String[]{"1", "1/2 cup", "1/2 cup", "8 pieces", "2 generous sprinkles"};
        
        for (int i = 0; i < pizzaItem.length; i++){
            System.out.printf("\n%-30s %s", pizzaItem[i], pizzaItemQty[i]);
        }
        
        System.out.println("\n\n* Pizza is to be appropriately cooked until crust is cooked and toppings are warmed *");
        System.out.println("\n*********************************************************************");
    }
    
    public static String GetIndredientChoice(){
        
        System.out.print("\n\nEnter choice: ");
        String input = stdin.nextLine();
        
        switch(input){
            case "a": 
                input = "a. pizza cheese";
                break;
            case "b": 
                input = "b. diced onion";
                break;
            case "c": 
                input = "c. diced green pepper";
                break;
            case "d": 
                input = "d. pepperoni";
                break;
            case "e": 
                input = "e. sliced mushroom";
                break;
            case "f": 
                input = "f. diced jalapenos";
                break;
            case "g": 
                input = "g. sardines";
                break;
            case "h": 
                input = "h. pineapple chunks";
                break;
            case "i": 
                input = "i. tofu";
                break;
            case "j": 
                input = "j. ham chunks";
                break;
            case "k": 
                input = "k. dry red pepper";
                break;
            case "l": 
                input = "l. dry basil";
                break;
            default: 
                break;
        }
        
        return input;
    }
}
