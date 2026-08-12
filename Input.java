import java.util.Scanner;
public class input{
    public static void main(string args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}