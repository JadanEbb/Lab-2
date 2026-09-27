//https://github.com/JadanEbb/Lab-2.git

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student("Jadan");
        Student student3 = new Student("John", "Smith");
        Student student4 = new Student("Jane", "Doe", 12345);

        System.out.println(student1.FirstName);
        System.out.println(student1.LastName);
        System.out.println(student1.studentID);

        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getStudentID());

        student2.setLastName("Ebb");
        student2.setStudentID(1001);

        System.out.println(student2.getFirstName());
        System.out.println(student2.getLastName());
        System.out.println(student2.getStudentID());

        System.out.println(student3.getFirstName());
        System.out.println(student3.getLastName());
        System.out.println(student3.getStudentID());

        System.out.println(student4.getFirstName());
        System.out.println(student4.getLastName());
        System.out.println(student4.getStudentID());
    }
}
