import java.util.Scanner;

public class UserInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = input.nextLine();
        
        System.out.println("Welcome "+ name);
        System.out.print(name + ",Also Enter your age :");
        int age = input.nextInt();
        System.out.println("your age is: " +age );
    }
}