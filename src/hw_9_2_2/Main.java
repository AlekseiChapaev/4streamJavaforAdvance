package hw_9_2_2;

import static hw_9_2_2.MonthsUtils.*;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Manager manager = new Manager();

        employee1.setName("Oleg");
        employee2.setName("Anna");
        employee1.setSalaryPerDay(100);
        employee2.setSalaryPerDay(100);

        manager.setName("Ivan");
        manager.setSalaryPerDay(100);
        manager.setNumberOfSubordinates(2);

        System.out.println(employee1.getSalary(February));
        System.out.println(manager.getSalary(February));

        System.out.println(employee1.getSalary(year));
        System.out.println(employee2.getSalary(year));
        System.out.println(manager.getSalary(year));

    }
}
