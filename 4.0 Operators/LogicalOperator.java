import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = input.nextInt();
        if(age < 18){
            System.out.println("Your are a child");
        }
        else if(age >= 18 && age <=60){
            System.out.println("Your are younger");
        } 
        else if(age >60 && age <=100){
            System.out.println("Yor are older");
        }
        else{
            System.out.println("That is not a valid age");
        }
    }
}
