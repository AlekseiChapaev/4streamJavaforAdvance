package hw_9_2_2_another_response.hw_9_2_2;

public class Main {

    public static void main(String[] args) {

        MonthsUtils monthUtils = new MonthsUtils();

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

        System.out.println(employee1.getSalary(monthUtils.getMonth(2)));
        System.out.println(manager.getSalary(monthUtils.getMonth(2)));

        System.out.println(employee1.getSalary(monthUtils.getYEAR()));
        System.out.println(employee2.getSalary(monthUtils.getYEAR()));
        System.out.println(manager.getSalary(monthUtils.getYEAR()));
    }
}
