import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        int a = sc.nextInt();
        System.out.print("Enter number b :");
        int b = sc.nextInt();
        int GCD = gcdOfNum(a,b);
        System.out.print("GCD of two number is : "+GCD);
    }
    public static int gcdOfNum(int a,int b){
        int gcd = 1;
        int i = 2;
        int least = least(a,b);
        while(i <= least){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int a,int b){
        if(a < b){
            return a;

        }else {
            return b;
        }
    
    }
}
