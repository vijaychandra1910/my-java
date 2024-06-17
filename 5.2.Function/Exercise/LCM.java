import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        int a = sc.nextInt();
        System.out.print("Enter number b :");
        int b = sc.nextInt();
        int lcm = LcmOfNum(a,b);
        System.out.println("LCM of two number is : "+lcm);
    }
    public static int LcmOfNum(int a,int b){
        int i = 1;
        while(true){
            int factor = a*i;
            if(factor % b == 0){
                return factor;
            }
            i++;
        }
     

    }
}
