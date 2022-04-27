package hw_8_1;

public class ArrayPlusArray {

        //https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java

    public static int getSumOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        return getSumOfArray(arr1) + getSumOfArray(arr2);

    }



    public static void main(String[] args) {

        System.out.println(arrayPlusArray(new int[]{1, 2}, new int[]{1, 2, 3, 18}));

    }

}
