import java.util.Scanner;

public class ArithmeticOpOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        int a = sc.nextInt();
        System.out.print("Enter number b :");
        int b = sc.nextInt();
        int Result = a + b - a * b / a % b;
        System.out.println(Result);
    }
}
