
package FinalProject;

/**
 * @author Daanyaal
 */


public class Item_Chest_of_Drawers extends Item {

    double price = 51.99;
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