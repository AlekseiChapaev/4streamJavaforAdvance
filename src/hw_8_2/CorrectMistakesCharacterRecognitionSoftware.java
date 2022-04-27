package hw_8_2;

public class CorrectMistakesCharacterRecognitionSoftware {

    //https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java

    public static String correct(String string) {

        return string.replace('5', 'S').replace('0', 'O').replace('1', 'I');
    }

    public static void main(String[] args) {

    }
}
