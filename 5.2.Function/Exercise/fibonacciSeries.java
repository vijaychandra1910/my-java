import java.util.Scanner;

class fibonacciSeries{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        fibonacciSeriesPrint(num);
    }
    public static void fibonacciSeriesPrint(int num){
        if (num < 0) return;
        if(num == 0) return;
        System.out.print("0 ");
        System.out.print("1 ");
        int first = 0,second = 1;
       while(first + second <=num){
          int third = first + second;
          System.out.print(third+ " ");
          first = second;
          second = third;
       }
    }
}
