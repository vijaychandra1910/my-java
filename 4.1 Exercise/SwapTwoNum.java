import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = input.nextInt();
        System.out.print("Enter number b: ");
        int b = input.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap");
        System.out.println("A is :" +a);
        System.out.println("B is :" +b);
    }
}
