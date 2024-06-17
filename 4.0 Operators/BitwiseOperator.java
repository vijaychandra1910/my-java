import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing Bitwise and operator\n");
        System.out.print("Enter the first number :");   // a = 12
        int a = input.nextInt();
        System.out.print("Enter the second number :");
        int b = input.nextInt();                        //b = 5

        //AND operator
        int r1 = a & b;                     //1100 & 0101 = 0100(if both 1 then 1 otherwise return 0)=4
        System.out.println("AND operation is : " +r1);

        //OR operator
        int r2 = a | b;                  // =1101 (if any 1 then return 1) = 13
        System.out.println("OR operation is " + r2);

        //XOR operator
        int r3 = a ^ b;                  // =1001(same same return 0 otherwise return 1) = 9
        System.out.println("XOR operation is " + r3);

        //NOT operator
        int r4 = ~b;                  // = 11111010(Complement)
        System.out.println("NOT operation is " + r4);

        //left Shift
        int r5 = b << 1;           // = 1010=10
        System.out.println("Left shift operation is :" +r5);

        //Right Shift
        int r6 = b >> 1;           // = 0010 = 2(Perform integer division) = 5/2= 2.5=2
        System.out.println("Left shift operation is :" +r6);
    }
}
