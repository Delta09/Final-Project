
package FinalProject;

/**
 * @author Daanyaal
 */


public class Item_Cupboard extends Item{

    double price = 55.99;
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