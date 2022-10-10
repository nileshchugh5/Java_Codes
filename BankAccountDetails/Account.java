public class Account{
    
    private int accountId;
    private int balance;
    private String accountType;
    
    public int getBalance(){
        return balance;
    }
    public int getAccountId(){
        return accountId;
    }
    public String getAccountType(){
        return accountType;
    }
    
    public void setBalance(int b){
       balance = b;
    }
    public void setAccountType(String a){
      accountType  = a;
    }
    public void setAccountId(int id){
       accountId = id;
    }
    
    
    public boolean withdraw(int a){
        if(getBalance() < a )
        {
               System.out.println("Sorry!!! No enough balance");
        return false;
            
        }
        else {
            System.out.println("Balance amount after: "+ (getBalance()-a));
            return true ;
    }
  }
}