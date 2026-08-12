import java.util.Scanner;
class Student{
    String name;
    int age;
    int rollNo;
    int marks;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter rollNo:");
        rollNo = sc.nextInt();
        System.out.println("Enter marks:");
        marks = sc.nextInt();
    }
    void out(){
        System.out.println("-----Student Details-----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------------");
    }

}
public class Main{
    public static void main(String[] args){
        Student s = new Student();
        s.input();
        s.out();
    }
}