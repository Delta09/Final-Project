
package FinalProject;

/**
 * @author Daanyaal
 */


public class Item_Desk extends Item{

    double price = 54.99;
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