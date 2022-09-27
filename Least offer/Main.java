import java.util.*;
class Product{
     String name;
     int price,disPer,Dp;
     
     public Product(String name,int price,int disPer,int Dp){
         this.name =name;
         this.price=price;
         this.disPer=disPer;
         this.Dp=Dp;
     }
     public String getN(){
         return name;
     }
          public int getDp(){
         return Dp;
     }
     
 }
 
public class Main{
    public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();
    int wp=0;
    Product [] pI = new Product[n];
    
    for(int i=0;i<n;i++){
        String input [] = in.next().split(",");
        String name =input[0];
        int price = Integer.parseInt(input [1]);
        int disPer =Integer.parseInt(input [2]);
        int Dp = (price * disPer) /100;
        pI[i]= new Product(name,price,disPer,Dp);
    
    
        if(i==0|| Dp < wp)
        wp = Dp;
    }
        for(Product p1 :pI)
      {
            if(p1.getDp() == wp){
            System.out.println(p1.getN());
        }
      }
    }
}
 