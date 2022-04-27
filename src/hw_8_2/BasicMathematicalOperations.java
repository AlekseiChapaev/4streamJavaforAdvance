package hw_8_2;

public class BasicMathematicalOperations {

        //https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java

    public static Integer basicMath(String op, int v1, int v2){
        if(op.equals("+")){
            return v1 + v2;
        }
        if(op.equals("-")){
            return v1 - v2;
        }
        if(op.equals("*")){
            return v1 * v2;
        }
        if(op.equals("/")){
            return v1 / v2;
        }
        return null;
    }

    public static Integer basicMath2(String operation, int x, int y){
        switch (operation){
            case "+": return x+y;
            case "-": return x-y;
            case "*": return x*y;
            case "/": return x/y;
        }
    return null;
    }

    public static void main(String[] args) {
        System.out.println(basicMath("%", 1, 2));
        System.out.println(basicMath2("+", 2, 4));

    }
}
