package hw_7_2;

public class Main {

    public static void main(String[] args) {

        MonthUtils utils = new MonthUtils();
        Employee employee = new Employee("Oleg", 5000);
        Manager manager = new Manager("Ivan", 5000, 3);
        Month[] arrMonths = {
                new Month("January", 31, 19),
                new Month("February", 28, 20),
                new Month("March", 31, 20),
                new Month("April", 30, 21)
        };

        System.out.println(utils.getMonth(arrMonths, "March"));
        System.out.println(employee.getSalary(arrMonths));
        System.out.println(manager.getSalary(arrMonths));

    }
}
