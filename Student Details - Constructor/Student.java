public class Student {
    private int studentId;
    private String  studentName,studentAddress,collegeName;
    
    public Student(int studentId,String studentName ,String studentAddress)
    {
         this.studentId = studentId;
         this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.collegeName = "NIT";
    }
    
    public Student(int studentId,String studentName,String studentAddress, String collegeName)
    {
        this(studentId,studentName,studentAddress);
        this.collegeName=collegeName;
    }
    
    public int getStudentId()
    {
        return this.studentId;
    }
    public String getStudentName()
    {
        return this.studentName;
    }
    public String getStudentAddress(){
        return this.studentAddress;
    }
     public String getCollegeName()
    {
        return this.collegeName;
    }
}