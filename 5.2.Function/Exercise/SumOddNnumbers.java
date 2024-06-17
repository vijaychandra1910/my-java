import java.util.Scanner;

class SumOddNnumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num :");
        int num = sc.nextInt();
        int sum = oddSum(num);
        System.out.println("Sum of "+num+ " odd number is :"+ sum);

    }
    public static int oddSum(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i += 2;
        }
        return sum;
    }
}