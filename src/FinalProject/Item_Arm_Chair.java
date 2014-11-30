
package FinalProject;

/**
 * @author Daanyaal
 */

public class Item_Arm_Chair extends Item{

    double price = 25.99;
    static int quantity = 50;
    
    @Override
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