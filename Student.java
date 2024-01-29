/**
 * The Student class in Java represents a student with a name and date of birth, and provides methods
 * to display the student's name and age.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Student extends StudentCourse  {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");


    }

    public static void main(String[] args) {
        Student s=new Student();
        StudentCourse s1 = new StudentCourse();
        s.name = "Sangeetha Manoji";
        s.displayName();
        s.displayAge("09-02-2004");
        s1.displayStudentcourses();
       s1.displayStudentMarks();

    }
}
