package hw_8_2;

import java.util.Arrays;

public class ReversedSequence {

        //https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java

    public static int[] reverse(int n) {
        int[] arr = new int[n];
        int temp = n;
        for(int i = 1; i <= n; i++){
            arr[i - 1] = temp;
            temp--;
        }

        return arr;
    }

    public static int[] reverse2(int n){
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n - i;
        }

        return arr;
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverse(10)));
        System.out.println(Arrays.toString(reverse2(10)));
    }

}
