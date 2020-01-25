/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javax.swing.JOptionPane;

/**
 *
 * @author DannyLaptop
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        System.out.println("Adding some more stuff");
        
        
        OtherClass.PrintMessage("I want to print something");
        
        JOptionPane.showMessageDialog(null, "I created a popup box", "this is the title", 1, null);
        Object[] options = {"Yes, please",
                    "No way!"};
int n = JOptionPane.showOptionDialog(null,
    "Would you like green eggs and ham?",
    "A Silly Question",
    JOptionPane.YES_NO_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,     //do not use a custom Icon
    options,  //the titles of buttons
    options[1]); //default button title
    }
    
}
