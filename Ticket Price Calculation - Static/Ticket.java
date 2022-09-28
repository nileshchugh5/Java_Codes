 public class Ticket{
    private int ticketid;
    private int price ;
    private static int availableTickets;
    
    public void setTicketid(int a){
        ticketid=a;
    }
    public void setPrice(int b){
        price = b;
    }
     public static void setAvailableTickets(int c){
        if(c>0)
        availableTickets=c;
    }
    public int getTicketid()
    {
        return ticketid;
    }
    public int getPrice()
    {
        return price;
    }
    public static int getAvailableTickets()
    {
        return availableTickets;
    }
    public int calculateTicketCost(int nooftickets)
    {
    if(nooftickets < availableTickets)
       { 
        availableTickets = availableTickets - nooftickets;
        return price * nooftickets ;
       }
    return -1;
}
}
