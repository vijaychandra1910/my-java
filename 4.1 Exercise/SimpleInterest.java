import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle(P) :");
        float p = sc.nextFloat();
        System.out.print("Enter Rate(R) :");
        float r = sc.nextFloat();
        System.out.print("Enter Time(T) :");
        int t = sc.nextInt();
        float SI= (p * r * t)/100;
        double CI = p*Math.pow((1+r/100),t);          //p(1 + r/100)^t
        System.out.println("Simple interest is : " + SI);
        System.out.println("Compound Intereset is :" +CI);
    }
}
