
package FinalProject;

import java.util.ArrayList;

/**
 * @author Daanyaal
 */


public class Stored_Sales {
    public static ArrayList<String> sales  = new ArrayList<>();

    public static void setValue(String newValue){
        String text = String.valueOf(newValue);
        sales.add(text);
    }
    
    public static String getSpecificValue(int i){
        return sales.get(i);
    }
}