import java.util.*;
import java.util.Scanner;
class Main{
    public static void main (String[] args) {
        double fuel,distance,total;
        double miles,gallons,ans;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no of liters to fill the tank\n");
        fuel=in.nextFloat();
        if(fuel <= 0)
        {
            System.out.print((int)fuel+" is an Invalid Input\n");
            return;
        }
        System.out.print("Enter the distance covered\n");
        distance=in.nextFloat();

        if(distance <= 0)
        {
            System.out.print((int)distance+ " is an Invalid Input\n");
            return;
        }
        else 
        {
            total=(fuel/distance)*100;
            System.out.format("Liters/100KM\n%.2f",total);
            miles =(distance * 0.6214);
            gallons =(fuel* 0.2642);
            ans =(miles/gallons);            
            System.out.format("\nMiles/gallons\n%.2f",ans);
        }
    }
    
}