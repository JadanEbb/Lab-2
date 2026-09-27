public class Student {

    public String FirstName;
    public String LastName;
    public int studentID;

   public Student() {
       this.FirstName = "";
       this.LastName = "";
       this.studentID = 0;
   }

   public Student(String firstName) {
       this.FirstName = firstName;
   }

    public Student(String firstName, String lastName) {
        this.FirstName = firstName;
        this.LastName = lastName;
    }

    public Student(String firstName, String lastName, int studentID) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.studentID = studentID;
    }

    //Getters and Setters
   public String getFirstName() {
       return FirstName;
   }
    public String getLastName() {
        return LastName;
    }
    public int getStudentID() {
        return studentID;
    }

    public void setFirstName(String firstName) {
       this.FirstName = firstName;
   }
   public void setLastName(String lastName) {
       this.LastName = lastName;
   }
   public void setStudentID(int studentID) {
       this.studentID = studentID;
   }






}