import java.util.Scanner;

public class SwapWithout3rdVar {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a: ");
      int a = input.nextInt();
      System.out.print("Enter b :");
      int b = input.nextInt();
      a = a + b;  
      b = a - b;
      a = a - b;
      System.out.println("After Swap :");
      System.out.println("A is :" +a);
      System.out.println("B is :" +b);
    }
}
