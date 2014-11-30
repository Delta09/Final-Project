
package FinalProject;

/**
 * @author Daanyaal
 */

//import java.util.Scanner;
//import javax.swing.JOptionPane
//import 

public class Item {

    public double price = 0.00;
    static public int quantity = 0;
    
    public Item(){
    }
    
    public double getPrice(){
        return price;
    }
    
    public static int getQuantity(){
        return quantity;
    }
    
    public static void UpdateQuantity(int purchased){
        quantity = (quantity - purchased);
    }
}