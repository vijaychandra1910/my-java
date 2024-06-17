import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Number :");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("The Entered number is Even");
        }
        else{
            System.out.println("The Entered number is Odd");
        }
    }
}
