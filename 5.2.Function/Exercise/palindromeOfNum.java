import java.util.Scanner;

class palindromeOfNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("The number is Palindrome");
        }else{
            System.out.println("The number is not Palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }

    public static int reverse(int num){
        int newNum = 0;
        while (num > 0){
            int digit = num % 10;
            newNum = newNum*10 +digit;
            num/=10;
        }
        return newNum;
    }
}
