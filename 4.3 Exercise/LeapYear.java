import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year to Check leap year or not :");
        int year = input.nextInt();

        if (year%400 == 0 || (year%4 == 0 && year%100 != 0)){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
