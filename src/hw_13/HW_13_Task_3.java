package hw_13;

import java.util.ArrayList;
import java.util.List;

public class HW_13_Task_3 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 1001; i++) {
            numbers.add(i);
        }

        List<Integer> result = new ArrayList<>();
        for(int n : numbers){
            if (n % 2 != 0){
                result.add(n);
            }
        }
        System.out.println(result);
    }
}
