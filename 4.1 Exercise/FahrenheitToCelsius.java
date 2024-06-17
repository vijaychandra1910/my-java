import java.util.Scanner;
public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degree in Fahrenheit : ");
        float f = sc.nextFloat();
        float c = ((f-32)* 5/9);
        System.out.println(f + "degree fahrenheit to celsius is : " + c);

        //Celsius to Fahrenheit
       System.out.print("Enter Cel : ");
        float cel = sc.nextFloat();
        float fah = (cel*9)/5+32;
        System.out.print("In Fahrenheit is " + fah);
    }
}
