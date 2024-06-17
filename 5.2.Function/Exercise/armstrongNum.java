import java.util.Scanner;

class armstrongNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("Your number is Armstrong.");
        }
        else{
            System.out.println("Your number is NOT Armstrong.");
        }
    }
    //Check armstrong
    public static boolean isArmstrong(int num){
        int noOfDigits = noOfDigits(num);
        int finalNumber =0;
        int copyNum = num;
        while (num > 0){
            int lastdigit = num % 10;
            num /= 10;
            finalNumber += pow(lastdigit,noOfDigits);
        }
        return finalNumber == copyNum;
    }

    //Calculate digits of number
    public static int noOfDigits(int num){
        int digits = 0;
        while(num > 0){
            digits++;
            num/=10;
        }
        return digits;

    }
    //POWER function 
    public static int pow(int num1,int num2){
        int result = 1;
        int i = 0;
        while(i < num2){
            result *=num1;
            i++;
        }
        return result;
    }

}