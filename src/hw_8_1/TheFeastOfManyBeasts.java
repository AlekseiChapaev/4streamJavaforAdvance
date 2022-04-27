package hw_8_1;

public class TheFeastOfManyBeasts {

            //https://www.codewars.com/kata/5aa736a455f906981800360d/train/java

    public static boolean feast(String beast, String dish) {
        return beast.substring(0, 1).equals(dish.substring(0, 1)) && beast.substring(beast.length() - 1).equals(dish.substring(dish.length() - 1));
    }

    public static void main(String[] args) {

        String word = "letter";
        System.out.println(word.length());
        System.out.println(word.charAt(word.length() - 1));
    }
}
