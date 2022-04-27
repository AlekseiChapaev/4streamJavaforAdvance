package hw_8_1;

public class AbbreviateTwoWords {

    // https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

    public static String abbrevName(String name) {
        String firstLetter = String.valueOf(name.charAt(0)).toUpperCase();
        String secondLetter = String.valueOf(name.charAt(name.indexOf(' ') + 1)).toUpperCase();
        return firstLetter + "." + secondLetter;
    }

    public static String abbrevName2(String name) {
        String firstLetter2 = name.substring(0, 1).toUpperCase();
        int index = name.indexOf(' ');
        String secondLetter2 = name.substring(index + 1, index + 2).toUpperCase();
        return firstLetter2 + "." + secondLetter2;
    }

    public static String abbrevName3(String name){

        return name.substring(0, 1).toUpperCase() + "." + name.substring(name.indexOf(' ') + 1, name.indexOf(' ') + 2).toUpperCase();
    }

    public static String abbrevName4(String name){
        name = name.toUpperCase();
        String firstLetter = String.valueOf(name.split(" ")[0].charAt(0));
        String secondLetter = String.valueOf(name.split(" ")[1].charAt(0));

        return firstLetter + "." + secondLetter;
    }

    public static void main(String[] args) {

        String word = "oleg first";

        System.out.println(abbrevName(word));
        System.out.println(abbrevName2(word));
        System.out.println(abbrevName3(word));
        System.out.println(abbrevName4(word));
    }

}
