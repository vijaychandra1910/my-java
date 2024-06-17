import java.util.Scanner;

public class AddTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = input.nextInt();
        System.out.print("Enter b :");
        int b = input.nextInt();
        int sum = a + b;
        System.out.print("Sum of " +a +" and " +b + " is :" +sum);
    }
}
