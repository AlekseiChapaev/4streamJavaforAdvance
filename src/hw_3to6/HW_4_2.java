package hw_3to6;

public class HW_4_2 {
    public static void main(String[] args) {

        String taskNumber = "\n*****************************************\n\t\t\t\tTask #";

        System.out.println(taskNumber + 1);

        String s = "Перестановочный алгоритм быстрого действия";
        char letter = 'о';

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                System.out.print(s.charAt(i));
            }
        }

        System.out.println(taskNumber + 2);

        String s1 = "Перевыборы выбранного президента";
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);

        System.out.println(taskNumber + 3);

        String s2 = "Посмотрите как Рите нравится ритм";
        s2 = s2.toLowerCase();

        int index = s2.indexOf("рит");

        while(index != -1) {
            System.out.println(index);

            index = s2.indexOf("рит", index + 1);
        }

        System.out.println(taskNumber + 4);

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int count1 = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(!array[i][j].contains("е")){
                    count1 += count1  + 1;
                }
            }
        }
        System.out.println(count);


    }
}