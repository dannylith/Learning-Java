/*Author: Danny Lithyouvong
 *Date: 1/28/20
 *Desc: display welcome message
 *File: C:\Users\dlithyouvong\Documents\Learning-Java
 */
package welcome;

import javax.swing.JOptionPane;


public class Welcome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // display welcome message
        System.out.println("Welcome to Java");
        
        //display welcome message to ui
        JOptionPane.showMessageDialog(null, "Welcome to Java");
    }
    
}
