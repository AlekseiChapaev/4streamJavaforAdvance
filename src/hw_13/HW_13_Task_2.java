package hw_13;

import java.util.ArrayList;
import java.util.List;

public class HW_13_Task_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 100; i < 1001; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}
