import java.util.Scanner;

class EvenOddUsingBitwise{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = input.nextInt();
        if((num&1)==1){
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even number");
        }
    }
}
