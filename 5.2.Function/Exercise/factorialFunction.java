import java.util.Scanner;

class factorialFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial is :"+fact);
    }
    public static long factorial(int n){
       if(n < 2){
        return 1;
       }
       long fact = 1;
       int i = 2;
       while(i <= n){
        fact *= i;
        i++;
       }
        return fact;
    }
}
