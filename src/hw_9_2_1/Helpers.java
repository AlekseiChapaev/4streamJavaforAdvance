package hw_9_2_1;

public class Helpers {

    public static boolean findEmployeeByName(Employee[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public static boolean findEmployeeByPartName(Employee[] names, String partName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].getName().contains(partName)) {
                return true;
            }
        }

        return false;
    }

    public static int getSalaryEmployees(Employee[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getSalary();
        }

        return sum;
    }

    public static int getMinSalary(Employee[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i].getSalary()){
                min = arr[i].getSalary();
            }
        }

        return min;
    }

    public static int getMaxSalary(Employee[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i].getSalary()){
                max = arr[i].getSalary();
            }
        }

        return max;
    }

    public static int getMinSub(Manager[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i].getNumberOfSubordinates()){
                min = arr[i].getNumberOfSubordinates();
            }
        }

        return min;
    }

    public static int getMaxSub(Manager[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i].getNumberOfSubordinates()){
                max = arr[i].getNumberOfSubordinates();
            }
        }

        return max;
    }

    public static int getMaxBonus(Manager[] arr){
        int maxBonus = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxBonus < arr[i].getSalary() - arr[i].getBaseSalary()){
                maxBonus = arr[i].getSalary() - arr[i].getBaseSalary();
            }
        }

        return maxBonus;
    }

    public static int getMinBonus(Manager[] arr){
        int minBonus = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(minBonus > arr[i].getSalary() - arr[i].getBaseSalary()){
                minBonus = arr[i].getSalary() - arr[i].getBaseSalary();
            }
        }

        return minBonus;
    }
}
