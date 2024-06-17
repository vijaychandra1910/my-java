import java.util.Scanner;

class reverseOfDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int reverse = reverseOfNum(num);
        System.out.println("Reverse is : "+reverse);
    }
    public static int reverseOfNum(int num){
        int newNum = 0;
        while(num > 0){
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num  /= 10;
        }
        return newNum;
    }
}
