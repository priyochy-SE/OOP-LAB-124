//Main.java

public class School_Final 
{
  public static void main(String[] args) 
  {
    Student student_no_1 = new Student("Priyabrata Chowdhury", 22, 23010101, "University of Science and Technology, Chattogram.");
    Student student_no_2 = new Student("Rohan Roy", 22, 59020201, "Shahjalal University of Science and Technology, Sylhet.");
    Student student_no_3 = new Student("Tasnim Binte Sattar", 21, 23010102, "University of Science and Technology, Chattogram.");
    Student student_no_4 = new Student("Asmita Guha", 21, 59020202, "Shahjalal University of Science and Technology, Sylhet.");
    Student student_no_5 = new Student("Tushar Barua", 22, 23010103, "University of Science and Technology, Chattogram.");
    Student student_no_6 = new Student("Rafidul Islam", 22, 23010104, "University of Science and Technology, Chattogram.");
    Student student_no_7 = new Student("Sneha Chowdhury", 21, 59020203, "Shahjalal University of Science and Technology, Sylhet.");
    
    System.out.println("\n");
    System.out.println("Student Details of USTC & SUST:");
    System.out.println("\n");
    System.out.println("After adding all students information of USTC & SUST:");
    System.out.println("\n");
    
    student_no_1.StudentDetails();
    student_no_2.StudentDetails();
    student_no_3.StudentDetails();
    student_no_4.StudentDetails();
    student_no_5.StudentDetails();
    student_no_6.StudentDetails();
    student_no_7.StudentDetails();
    
    System.out.println("\f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f \f");
    System.out.println("\n");
    System.out.println("After removing two students for creating a shortlist: ");
    System.out.println("\n");
    
    student_no_1.StudentDetails();
    student_no_3.StudentDetails();
    student_no_4.StudentDetails();
    student_no_5.StudentDetails();
    student_no_7.StudentDetails();
  }
}



