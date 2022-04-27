package hw_3to6;

public class HW_loops {

    static String[] spaceArray = {"  "};
    
    public static void main(String[] args) {

        String taskNumber = "\n********************************\n\t\t\tTask # ";

        System.out.println(taskNumber + 1);

        int numberOfRows = 10;
        int numOfSymbols = 10;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numOfSymbols; j++) {
                System.out.print(j + " ");
            }
            numOfSymbols--;
            System.out.println();
        }

        System.out.println(taskNumber + 2);

        int cyk = 10;
        String space = spaceArray[0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < cyk; j++) {
                System.out.print(j + " ");
            }
            cyk--;
            System.out.println();
            System.out.print(space);
            space = space + spaceArray[0] ;
        }

        System.out.println(taskNumber + 2 + "Ver2\n*******************************");

        int digitCount = 10;
        String space2 = " ";
        String tempSpace = " ";
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < digitCount; j++){
                System.out.print(j);
            }
            digitCount--;
            System.out.println();
            System.out.print(tempSpace);
            tempSpace = tempSpace + space2;
        }

        System.out.println(taskNumber + 3);

        int num = 10;
        String space3 = "  ";
        String tempSp = "  ";
        for (int i = 0; i < 10; i++){
            for(int j = num - 1; j >= 0; j--){
                System.out.print(j + " ");
            }
            for(int k = 1; k < num; k++){
                System.out.print(k + " ");
            }
            System.out.println();
            System.out.print(tempSp);
            tempSp = tempSp + space3;
            num--;
        }

        System.out.println(taskNumber + 3 + "Ver2\n*******************************");


        int numbersOfDigits = 10;
        String space4 = " ";
        String tempSpace2 = " ";
        for (int i = 0; i < 10; i++) {
            for (int j = numbersOfDigits - 1; j >= 0; j--) {
                System.out.print(j);
                if (j == 0) {
                    for (int k = 1; k < numbersOfDigits; k++) {
                        System.out.print(k);
                    }
                }
            }
            numbersOfDigits--;
            System.out.println();
            System.out.print(tempSpace2);
            tempSpace2 = space4 + tempSpace2;
        }
    }
}