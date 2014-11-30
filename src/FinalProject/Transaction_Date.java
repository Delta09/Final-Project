
package FinalProject;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Daanyaal
 */


public class Transaction_Date {
    static ArrayList<Date> d = new ArrayList<>();
    static Date date = new Date();
    
    public static void setTransactionDate(Date date){
        d.add(date);
    }

    public static Date getSpecificValue(int i){
        return d.get(i);
    }
}