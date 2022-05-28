package hw_13;

import java.util.ArrayList;
import java.util.List;

public class HW_13_Task_4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 1001; i++) {
            numbers.add(i);
        }

        List<Integer> result = new ArrayList<>();
        for (Integer i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) % 2 != 0){
                result.add(numbers.get(i));
            }
        }
        System.out.println(result);
    }
}
