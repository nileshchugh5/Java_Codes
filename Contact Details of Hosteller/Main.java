import java.util.Scanner;

public class Main{
    public static Hosteller getHostellerDetails()
    {
       // Student s = new Student(); 
        Hosteller h = new Hosteller();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Details:\nStudent Id \n");
        int id = in.nextInt();
        h.setStudentId(id);
        
        System.out.println("Student Name \n");
        String name = in.next();
        h.setName(name);
        
        System.out.println("Department id \n");
        int dId= in.nextInt();
        h.setDepartmentId(dId);
        
        System.out.println("Gender\n");
        String gender=in.next();
        h.setGender(gender);
        
        System.out.println("Phone Number\n");
        String mobile =in.next();
        h.setPhone(mobile);
        
        System.out.println("Hostel Name\n");
        String hm = in.next();
        h.setHostelName(hm);
        
        System.out.println("Room Number\n");
        int rm =in.nextInt();
        h.setRoomNumber(rm);

    System.out.println("Modify Room Number (Y/N)");
        while(true)
        {
           
            String ans = in.next();
            if(ans.equalsIgnoreCase("Y"))
            {
                 System.out.println("New Room Number \n");
                 int nrm =in.nextInt();
                h.setRoomNumber(nrm);
                break;
            }
            else 
              if(ans.equalsIgnoreCase("N"))
            {
                break;
            }
        }
         System.out.println("Modify Room Number (Y/N)");
           while(true)
        {
           
             String ans = in.next();
            if(ans.equalsIgnoreCase("Y"))
            {
                System.out.println("New Phnone Number \n");
                String nmobile =in.next();
                h.setPhone(nmobile);
                break;
            }
           else 
             if(ans.equalsIgnoreCase("N"))
            {
                break;
            }
        }
        return h;
    }
    public static void main (String[] args) {
        Hosteller h1 = new Hosteller();
        h1 = getHostellerDetails();
        
        System.out.println(h1.getStudentId()+" "+h1.getName()+" "+h1.getDepartmentId()+" "+h1.getGender()+" "+h1.getPhone()+" "+h1.getHostelName()+" "+h1.getRoomNumber()+" ");
        
    }
}