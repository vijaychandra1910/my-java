import java.util.Scanner;

public class PersonInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name :");
        String name = input.nextLine();
        System.out.print("welcome " + name +" to KG Coding");
    }
}
