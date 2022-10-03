public class Student{
    protected int studentId,departmentId;
    protected String name,phone,gender;
     
     public int getStudentId(){
         return studentId;
     }
      public int getDepartmentId(){
         return departmentId;
     }
      public String getName(){
         return name;
     }
      public String getPhone(){
         return phone;
     }
      public String getGender(){
         return gender;
     }
     
     
     
     public void setStudentId(int studentId){
         this.studentId= studentId;
     }
      public void setDepartmentId(int departmentId){
        this.departmentId = departmentId;
     }
      public void setName(String name){
         this.name = name;
     }
      public void setPhone(String phone){
         this.phone = phone;
     }
      public void setGender(String gender){
         this.gender= gender;
     }
    
}
