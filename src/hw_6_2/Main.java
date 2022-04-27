package hw_6_2;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Anna", 20, 'F', 10000);
        Employee employee2 = new Employee("Sergey", 20, 'M', 15000);
        Employee employee3 = new Employee("Anna", 30, 'F', 20000);
        Salary salary = new Salary();

        System.out.println(employee1.getPrefix());
        System.out.println(employee2.getPrefix());
        System.out.println(employee1.isSameName(employee2));
        System.out.println(salary.getSum(new Employee[]{employee1, employee2, employee3}));



    }

}
