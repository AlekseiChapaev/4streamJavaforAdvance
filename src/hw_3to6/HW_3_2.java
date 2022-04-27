package hw_3to6;

import java.util.Arrays;

public class HW_3_2 {

    public static void printLine(String line, int taskNumber){
        System.out.println(line + taskNumber);
    }

    public static void main(String[] args) {

        String line = "\n*********************************************\n\t\t\tTask# ";

        printLine(line, 1);

        for (int i = 0; i < 16; i++) {
            System.out.print(i + " ");
        }

        printLine(line, 2);

        int num = 5;
        for (int i = 1; i < 10000; i = i * num) {
            System.out.print(i + " ");
        }

        System.out.println("\n*********************************************");

        int num3 = 5;
        for(int i = 0; i < 10; i++){
            int pow = (int)Math.pow(num3, i);
            if(pow < 10000){
                System.out.print(pow + " ");
            }
        }

        System.out.println("\n*********************************************");


        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n*********************************************");

        int num1 = 40;
        int num2 = 60;
        while (num1 <= num2) {
            System.out.print(num1 + " ");
            num1 = num1 + 4;
        }
        System.out.println("\n*********************************************");

        num1 = 40;
        while (num1 % 4 == 0 && num1 <= 61) {
            System.out.print(num1 + " ");
            num1 = num1 + 4;
        }

        System.out.println("\n*********************************************");

        int[] arr = {1,5};
        double a = arr[0];
        System.out.println(a);
        System.out.println(Arrays.toString(arr));

        String str = "Hello!";
        String str1 = str.replace('l', 'X');
        String str2 = str.replace("Hel", "Po");
        System.out.println(str.replace('l', '_'));
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str.length());
        System.out.println(str1.length());

        System.out.println("\n*********************************************");

        String str3 = "Hello everyone";
        System.out.println(str3.substring(1, 4));
        int count = 0;
        for (int i = 0; i < str3.length(); i++){
            if(str3.charAt(i) == '!'){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(str3.charAt(0));
        System.out.println(str3.indexOf("l"));

        System.out.println(str3.charAt(2));

    }
}
