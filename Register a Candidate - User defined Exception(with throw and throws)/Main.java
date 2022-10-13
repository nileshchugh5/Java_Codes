import java.util.*;

public class Main{
    public static Candidate getCandidateDetails() throws InvalidSalaryException
    {
        Candidate c = new Candidate();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        c.setName(in.nextLine());
        System.out.println("Gender");
        c.setGender(in.nextLine());
        System.out.println("Expected Salary");
        double expsal = in.nextDouble();
        if(expsal < 10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        c.setExpectedSalary(expsal);
        return c;
        }
        
        public static void main (String[] args) {
         try{
             Candidate co = Main.getCandidateDetails();
             if(co != null)
             {
                 System.out.println("Registration Successful");
             }
         }
            catch(InvalidSalaryException e){
                System.out.println(e.getMessage());
            }
        }
}