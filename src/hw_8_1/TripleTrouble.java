package hw_8_1;

public class TripleTrouble {

            // https://www.codewars.com/kata/5704aea738428f4d30000914/train/java

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++){
            result += String.valueOf(one.charAt(i)).concat(String.valueOf(two.charAt(i))).concat(String.valueOf(three.charAt(i)));
        }
        
        return result;
    }

    public static String tripleTrouble2(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++){
            result += one.substring(i, i + 1).concat(two.substring(i, i + 1).concat(three.substring(i, i + 1)));
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(tripleTrouble("art", "led", "cat"));
        System.out.println(tripleTrouble2("art", "led", "cat"));

    }

}
