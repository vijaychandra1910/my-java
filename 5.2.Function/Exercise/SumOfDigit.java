import java.util.Scanner;

class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is :"+sum);

    }
   public static int sumOfDigits(int num){  // For example num = 521 
                                            // in first iteration
    int sum = 0;                            //512 > 0 then sum = 0 +(521%10)=1
    while(num > 0){                         //num = 521 / 10=52
        sum +=(num%10);                     // 2nd iteration 
        num /=10;                           //sum = 1 (52%10)= 2 +1=3
                                            //num = 52/10= 5
                                            //3rd iteration 
                                            //sum = 3+ (5%10)= 5+3= 8
                                            //num = 5/10 = 0
                                            //loop stop and return 8

    }
    return sum;
   }
    
    
}
