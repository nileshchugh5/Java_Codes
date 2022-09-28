import java.util.*;
import java.util.Scanner;

public class Main{
 public static void main (String[] args)
  {
    Ticket t=new Ticket(); 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter no of bookings:");
    int no =in.nextInt();
    System.out.println("Enter the available tickets:");
    int avail =in.nextInt();
    t.setAvailableTickets(avail);
      while(no>0)
    {
     System.out.print("Enter the ticketid:");
     int id = in.nextInt();
     t.setTicketid(id);
     System.out.println("Enter the price:");
     int p1 = in.nextInt();
     t.setPrice(p1);
     System.out.println("Enter the no of tickets:");
     int noT = in.nextInt();
     System.out.println("Available tickets:" + t.getAvailableTickets());
     System.out.println("Total anount:" + t.calculateTicketCost(noT));
     System.out.println("Available tickets after booking:"+ t.getAvailableTickets());
     no--;
    } 
 
    }
}