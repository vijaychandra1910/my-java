import java.util.Scanner;

class arraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = { 4,67,40,3,43,65,2,1,7};
        System.out.print("Enter the number you want to search :");
        int num = input.nextInt();
        boolean isFound = isFound(arr,num);
        if(isFound){
            System.out.println("Your number is found in array.");
        }else{
            System.out.println("Your number is not found in array.");
        }
    }
    public static boolean isFound(int[] arr,int num){
        int index = 0;
        while(index < arr.length){
            
            if(arr[index] == num){
                return true;
            }
            index ++;
        }
        return false;
    }

}
