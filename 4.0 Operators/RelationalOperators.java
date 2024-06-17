import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age :");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("Childe");
        }
        else if(age >= 18){
            System.out.println("Adult");
        }
    }
}
