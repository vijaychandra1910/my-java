import java.util.Scanner;

public class arrayUtility {
    
    // For array element input

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("PLease enter the number of Element : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while(i < size){
            System.out.print("Please enter element no " +(i+1) + " : ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static void displayArr(int[] numArr){
        int i = 0;
        while(i < numArr.length){
            System.out.print(numArr[i] + " ");
            i++;
        }
        System.out.println();
    }
}
