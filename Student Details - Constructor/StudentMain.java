import java.util.Scanner;
public class StudentMain
{
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int studentId=in.nextInt();
        
        System.out.println("Enter Student's Name:");
        String studentName=in.next();
        
        System.out.println("Enter Student's address:");
        String studentAddress=in.next();
        
        while(true)
        {
            System.out.println("Whether the student is from NIT(yes/no):");
            String ans =in.next();
             
             if(ans.equalsIgnoreCase("yes"))
             {
                 Student s =new Student(studentId,studentName,studentAddress);
                 System.out.println("Student id:"+s.getStudentId());
                 System.out.println("Student name:"+s.getStudentName());
                 System.out.println("Address:"+s.getStudentAddress());
                 System.out.println("College name:"+s.getCollegeName());
                 break;
             }
             else 
               if(ans.equalsIgnoreCase("no"))
             {
                 System.out.println("Enter the college name:");
                 String collegeName = in.next();
                 
                 Student s =new Student(studentId,studentName,studentAddress,collegeName);
                 
                 System.out.println("Student id:"+s.getStudentId());
                 System.out.println("Student name:"+s.getStudentName());
                 System.out.println("Address:"+s.getStudentAddress());
                 System.out.println("College name:"+s.getCollegeName());
                 break;
             }
             
             else
             { 
                 System.out.println("Wrong Input");
             }
            
        }
    }
}