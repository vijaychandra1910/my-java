public class Parameter {
    public static void main(String[] args) {
        int num = sum(2,4);                      // If actual value pass is called Argument  
        System.out.println("Result is :"+num);
        
    }
    public static int sum(int first, int second){ // If definition defined is called parameter
        System.out.println("First number recieved is :" +first);
        System.out.println("Second number recieved is :" +second);
        int sum = first + second;
        return sum;
    }
}
