//Student.java

public class Student {
  private String name;
  private int age;
  private int id;
  private String uni_name;

  public Student(String name, int age, int id, String uni_name) 
  {
    this.name = name;
    this.age = age;
    this.id = id;
    this.uni_name = uni_name;
  }

  public String getName() 
  {
    return name;
  }

  public int getAge() 
  {
    return age;
  }
  
  public int getId() 
  {
    return id;
  }
  
  public String Uni_name() 
  {
    return uni_name;
  }
  public void StudentDetails() 
  {
    System.out.println("Students name: " + name);
    System.out.println("Students Age: " + age);
    System.out.println("Students Id: " + id);
    System.out.println("University name: " + uni_name);
    System.out.println("\n");
  }
}
