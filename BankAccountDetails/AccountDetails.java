import java.util.*;
public class AccountDetails
{
       public static void main (String[] args) {
        Account acc2 = new Account();
        acc2 = getAccountDetails();
        int temp = getWithdrawAmount();
        acc2.withdraw(temp);
    }
    public static Account getAccountDetails()
    {
        Scanner in = new Scanner(System.in);   
        Account acc1 = new Account();
        System.out.println(" Enter  account id:");
        int id =in.nextInt();
        System.out.println(" Enter account type:");
        String type =in.next();
        
        while(true)
        {
        System.out.println(" Enter  balance:");
        int bal =in.nextInt();
            if(bal <= 0){
                System.out.println("Balance should be positive");
            }
            else{
                acc1.setBalance(bal);
                break;
              }
        }
        acc1.setAccountId(id);
        acc1.setAccountType(type);
        
        return acc1 ;
    }
    public static int getWithdrawAmount(){
        int amt;
           Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter amount to be withdrawn");
            amt = in.nextInt();
            if(amt <= 0)
            {
                System.out.println("Amount should be positive");
            }
        } while(amt<=0);
        return amt;
    }

  }
