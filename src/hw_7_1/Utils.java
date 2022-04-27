package hw_7_1;

public class Utils {

    public String printDatesEmployee(Employee employee) {
        return "Employee dates: name " + employee.getName() + " " + employee.getSurname() + " salary " + employee.getSalary();
    }

    public void findEmployee(Employee[] employees, String name) {
        if (employees == null) {
            System.out.println("Blank array employees");
        } else {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getName().equals(name)) {
                    System.out.println(printDatesEmployee(employees[i]));
                }
            }
        }
    }

    public void findEmployeeByPartWord(Employee[] employees, String partWord) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getName().toLowerCase().contains(partWord)) {
                System.out.println(printDatesEmployee(employees[i]));
            }
        }
    }

    public int findTotalSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public int findMinSalary(Employee[] employees) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (min > employees[i].getSalary()) {
                min = employees[i].getSalary();
            }
        }
        return min;
    }

    public int findMaxSalary(Employee[] employees) {
        int max = 0;
        for (int i = 0; i < employees.length; i++) {
            if (max < employees[i].getSalary()) {
                max = employees[i].getSalary();
            }
        }
        return max;
    }

    public int findMinSubordinates(Manager[] managers){
        int countSubordinates = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            if (countSubordinates > managers[i].getNumberOfSubordinates()){
                countSubordinates = managers[i].getNumberOfSubordinates();
            }
        }
        return countSubordinates;
    }

    public int findMaxSubordinates(Manager[] managers){
        int countSubordinates = 0;
        for (int i = 0; i < managers.length; i++) {
            if (countSubordinates < managers[i].getNumberOfSubordinates()){
                countSubordinates = managers[i].getNumberOfSubordinates();
            }
        }
        return countSubordinates;
    }

    Employee employee = new Employee("", "");
    public int findMaxBonus(Manager[] managers){
        int maxBonus = 0;
        for (int i = 0; i < managers.length; i++) {
            int bonus = managers[i].getSalary() - employee.getBaseSalary();
            if(maxBonus < bonus){
                maxBonus = bonus;
            }
        }
        return maxBonus;
    }

    public int findMinBonus(Manager[] managers){
        int minBonus = Integer.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            int bonus = managers[i].getSalary() - employee.getBaseSalary();
            if(minBonus > bonus){
                minBonus = bonus;
            }
        }
        return minBonus;
    }
}
