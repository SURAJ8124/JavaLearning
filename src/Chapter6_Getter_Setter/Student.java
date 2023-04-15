package Chapter6_Getter_Setter;

public class Student {

    private String studentName ;
    private String mobileNumber;

    private String studentAddress;
    private int studentId;

    public String getStudentName() {
        return studentName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

     public void display(){
        System.out.println("Student Name : "+studentName);
        System.out.println("Student id :"+studentId);
         System.out.println("Student Address :"+studentAddress);
         System.out.println("Student mobile no. : "+mobileNumber);
     }

    public Student() {
    }

    public static void main(String[] args){
        Student student= new Student();
        student.setStudentAddress("Wakad road, pink city ");
        student.setStudentId(34);
        student.setStudentName("Rahul Subramnayam");
        student.setMobileNumber("7559378124");
        student.display();
      }
}
