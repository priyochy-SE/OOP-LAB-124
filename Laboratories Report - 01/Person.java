public class Person {

    String name;
    int age;

    static int count = 0;

    public static void main(String[] args) {
        Person P1 = new Person();
        P1.age = 22;
        P1.name = "PRIYOBRATA CHOWDHURY";
        count++;
                    
        Person P2 = new Person();
        P2.age = 20;
        P2.name = "ROHAN ROY";
        count++; 

        System.out.println("1st person name : " + P1.name + ". His age is " + P1.age + ".");
        System.out.println("\n2nd person name : " + P2.name + ". His age is " + P2.age + ".");

        System.out.println("\nTotal number of persons = " + count + "\n");
    }
}
