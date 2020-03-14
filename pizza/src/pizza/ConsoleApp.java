/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

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
    }
    
    public static void DisplayCrustOption(){
        System.out.println("*********************************************************************");
        System.out.println("Please choose one crust options: ");
        System.out.printf("\n%s %30s \n", "a. regular crust", "b. gluten-free crust");
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
        System.out.printf("%s %30s", "a. red sauce", "b. no red sauce");
        System.out.print("\nEnter choice: ");
        String input = stdin.nextLine();
        String choice = "";
        
        if(input.compareTo("a") == 0) input = "a. red sauce";
        if(input.compareTo("b") == 0) input = "b. no red sauce";
        
        System.out.println("Please choose one amount:\n");
        System.out.printf("%s %30s", "a. 1/4 cup", "b. 1/2 cup\n\n");
        System.out.print("Enter choice: ");
        String input2 = stdin.nextLine();
        
        if(input2.compareTo("a") == 0) input2 = "1/4 cup";
        if(input2.compareTo("b") == 0) input2 = "1/2 cup";
        
        System.out.println("* You chose:\t" + input + " = " + input2 + " *");
        
    }
}
