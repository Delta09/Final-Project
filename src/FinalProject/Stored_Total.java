
package FinalProject;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * @author Daanyaal
 */


public class Stored_Total {
    static DecimalFormat df = new DecimalFormat("0.00");
    public static ArrayList<Double> totalSales  = new ArrayList<>();
    public static double total = 0;

    public static void setTotal(String total){
        Stored_Total.total = Double.parseDouble(total);
        totalSales.add(Stored_Total.total);
    }
    
    public static String sumTotal(){
        double sum = 0;
        for(int i = 0; i < totalSales.size(); i++){
            sum += totalSales.get(i);
        }
        return df.format(sum);
    }
}