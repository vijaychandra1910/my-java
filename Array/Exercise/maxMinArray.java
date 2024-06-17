class maxMinArray {
    public static void main(String[] args) {
        int [] newArr = arrayUtility.inputArray();
        int max = max(newArr);
        int min = min(newArr);
        System.out.println("Maximum of the Array is : "+max);
        System.out.println("Minimum of the Array is : "+min);

    }
    public static int max(int[] numArr){
        if(numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 1;
        while(i<numArr.length){
            if(max<numArr[i]){
                max = numArr[i];
            }
            i++;
        }
        return max;

    }
    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while(i < numArr.length){
            if(min>numArr[i]){
                min = numArr[i];
            }
            i++;
        }
        return min;
}
}
