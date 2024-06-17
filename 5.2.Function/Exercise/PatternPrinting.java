import java.util.Scanner;

class PatternPrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Rows : ");
        int rows = sc.nextInt();
        printRightPattern(rows);
        printRevPattern(rows);
        printLeftPattern(rows);

    }
    public static void printRightPattern(int rows){
        System.out.println("Here is the right half pyramid");

        int r=0;
        while(r < rows){
            System.out.print("*");
            int i = 0;
            while(i < r){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            r++;
        }
        System.out.println();
    }
   public static void printRevPattern(int rows){
    System.out.println("Here is the reverse half pyramid");
    int r = rows;
    while(r > 0){
        int i = 0;
        while(i < r){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        r--;
    }
    System.out.println();
   }

   public static void printLeftPattern(int rows){
    System.out.println("Here is the left half pyramid");
    int r = rows;
    while(r > 0){
        //loop for print space
       int j=0;
       while(j<r){
        System.out.print("  ");
        j++;
       }
        //loop for print *
        int i = 0;
        while(i <= (rows-r)){
            System.out.print("* ");
            i++;
        }
        System.out.println();
        r--;
    }
   }
}
   

