package hw_13;

import java.util.ArrayList;
import java.util.List;

public class HW_13_Task_1 {

    public static void main(String[] args) {

        List<String> color = new ArrayList<>();
        color.add("White");
        color.add("Tan");
        color.add("Yellow");
        color.add("Orange");
        color.add("Red");
        color.add("Pink");
        color.add("Purple");
        color.add("Blue");

        List<String> result = new ArrayList<>();
        for(String str : color) {
            if(!str.contains("l")){
                result.add(str);
            }
        }
        System.out.println(result);
    }
}
