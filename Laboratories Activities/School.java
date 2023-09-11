//School.java

import java.util.ArrayList;

public class School {
  private ArrayList < Student > students;

  public School() {
    this.students = new ArrayList < Student > ();
  }

  public void addStudent(Student student) 
  {
    students.add(student);
  }

  public void removeStudent(Student student) {
    students.remove(student);
  }
}
