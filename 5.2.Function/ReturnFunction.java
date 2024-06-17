import java.util.Scanner;

public class ReturnFunction {
    public static void main(String[] args) {
        System.out.println("Welcom to Calculator");

        //Add two number using return function
    int first = readNum();
    int second = readNum();
    int sum = first + second;
    System.out.println("Sum of number is :"+ sum);
    }
    public static int readNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        return sc.nextInt();
    }
}
