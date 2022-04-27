package hw_8_1;

public class FindThePosition {

            // https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java

    public static String position(char alphabet){

        return "Position of alphabet: " + (alphabet - 96);
    }

    public static void main(String[] args) {
        //char 'а' == 97;

        System.out.println(position('a'));

    }

}
