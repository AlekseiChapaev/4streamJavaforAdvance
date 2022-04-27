package hw_6_2;

public class Salary {

    int getSum(Employee[] employeeArray){
        int sum = 0;
        for(int i = 0; i < employeeArray.length; i++){
            sum += employeeArray[i].getSalary();
        }
        return sum;
    }
}
