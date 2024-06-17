import java.util.Scanner;

class GradesBasedMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage :");
        float percent = sc.nextInt();

        if (percent >=90 && percent <=100){
            System.out.println("Your got A grade");
        }
        else if(percent >= 75 && percent < 90){
            System.out.println("Yor got B grade");
        }
        else if(percent >= 60 && percent < 75){
            System.out.println("You got C grade");
        }
        else if(percent >= 30 && percent < 60){
            System.out.println("You got D grade");
        }
        else if(percent < 30){
            System.out.println("You got F grade");
        }
        else {
            System.out.println("Not a valid marks");
        }
    }
}
