public class TypeConversion {
    public static void main(String[] args) {

        //Implicit
        long big = 45;
        float dec = 3;
        double d = 3.4f;
        System.out.println(big); //45
        System.out.println(dec); // 3.0
        System.out.println(d); // 3.4000000...

        //Explicit 
        float eDec = (float) 3.4; //3.4
        long eBig = (long) 3.4; // 3
        int eInt = (int) 3.4;  // 3
        System.out.println(eDec);
        System.out.println(eBig);
        System.out.println(eInt);
    }
}
