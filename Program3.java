import java.util.Scanner;
public class Program3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five name:");
        for(int i=0; i<5; i++){
            String name = sc.nextLine();
            System.out.println("Name:"+name);
        }
        sc.close();
    }
}