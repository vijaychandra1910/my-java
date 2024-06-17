import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number : ");
        int num = input.nextInt();

        if(num == 0){
            System.out.println("Number is Zero");
        }
        else if(num < 0){
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is positive");
        }
    }
}
