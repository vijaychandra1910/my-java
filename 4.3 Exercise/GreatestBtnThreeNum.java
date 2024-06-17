import java.util.Scanner;

public class GreatestBtnThreeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = input.nextInt();
        System.out.print("Enter b : ");
        int b = input.nextInt();
        System.out.print("Enter c :");
        int c = input.nextInt();

        if(a>=b && a>=c){
            System.out.println(a +" is greatest number");
        }
        else if(b>=c){
            System.out.println(b +" is greatest number");
        }
        else {
            System.out.println(c +" is greatest number");
        }

    }
}
