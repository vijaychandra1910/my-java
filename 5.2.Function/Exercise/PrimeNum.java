import java.util.Scanner;

class PrimeNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number : ");
       int num = sc.nextInt();
       boolean prime = isPrimeNum(num);
       if(prime){
        System.out.println("Prime number");
       }else{
        System.out.println("Not Prime number");
       }
    }
    public static boolean isPrimeNum(int num){
        int i =2;
        while(i < num){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
