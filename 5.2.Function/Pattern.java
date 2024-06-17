public class Pattern {
    public static void main(String[] args) {
        Pattern();
    }
    public static void Pattern(){
        int rows = 0;
        while(rows < 5){                 
                                         //rows = 0 (0<5)  print *
                                         //i =0 (0<0) false Terminate from the inside of loop
                                         //row = 1 println for next line 

            System.out.print("*");
            int i=0;
            while(i < rows){
                System.out.print(" *");
                i++;
            }
            rows ++;
            System.out.println();
        }
    }
}
                                        
                                         
