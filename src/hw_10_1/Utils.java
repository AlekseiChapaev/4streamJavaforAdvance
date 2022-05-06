package hw_10_1;

public class Utils {

    public static String getDataOfEmployee(Employee employee){
        if(employee != null) {
            StringBuilder sb = new StringBuilder();
            return sb.append(employee.getName()).append(" ").append(employee.getSalary()).toString();
        }
        System.out.println("Нет данных на сотрудника с таким именем");
        return null;
    }

    public static void getDataOfEmployeesArray(Employee[] employee) {
        if(employee != null) {
            for (int i = 0; i < employee.length; i++) {
                System.out.println(getDataOfEmployee(employee[i]));
            }
        } else{
            System.out.println("Нет данных на сотрудника с таким именем");
        }
    }

    public static Employee[] findEmployeeByName(Employee[] arr, String name){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                count++;
            }
        }
        if(count == 0){
            System.out.println("Сотрудник с таким именем не найден");
            return null;
        } else {
            Employee[] newArr = new Employee[count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getName().equals(name)) {
                    newArr[index++] = arr[i];
                }
            }
            return newArr;
        }
    }

    public static Employee[] findEmployeeByPartName(Employee[] arr, String partName){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().contains(partName)) {
                count++;
            }
        }
        if(count == 0){
            System.out.println("Сотрудник с таким именем не найден");
            return null;
        } else {
            Employee[] newArr = new Employee[count];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].getName().contains(partName)) {
                    newArr[index++] = arr[i];
                }
            }
            return newArr;
        }
    }

    public static int getSalaryOfEmployeesArray(Employee[] employee){
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    public static int findMaxSalary(Employee[] employees){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if(max < employees[i].getSalary()){
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public static int findMinSalary(Employee[] employees){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if(min > employees[i].getSalary()){
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public static int findMaxSubordinates(Manager[] managers){
        int max = 0;
        for (int i = 0; i < managers.length; i++) {
            if(max < managers[i].getNumbersOfSubordinates()){
                max = managers[i].getNumbersOfSubordinates();
            }
        }
        return max;
    }

    public static int findMinSubordinates(Manager[] managers){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if(min > managers[i].getNumbersOfSubordinates()){
                min = managers[i].getNumbersOfSubordinates();
            }
        }
        return min;
    }

    public static int findMaxBonus(Manager[] managers){
        int max = 0;
        for (int i = 0; i < managers.length; i++) {
            if(max < managers[i].getSalary() - managers[i].getBaseSalary()){
                max = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }
        return max;
    }

    public static int findMinBonus(Manager[] managers){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if(min > managers[i].getSalary() - managers[i].getBaseSalary()){
                min = managers[i].getSalary() - managers[i].getBaseSalary();
            }
        }
        return min;
    }
}
