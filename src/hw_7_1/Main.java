package hw_7_1;

public class Main {
    public static void main(String[] args) {

        Utils utils = new Utils();
        Employee emp = new Employee();
        emp.setBaseSalary(10000);

        Worker worker1 = new Worker("Oleg", "Ivanov");

        Worker worker2 = new Worker("Anna", "Anna");
        Worker worker3 = new Worker("Oleg", "Petrov");
        worker3.setBaseSalary(12000);
        Manager manager1 = new Manager("Petr", "Ivanov", 2);
        Manager manager2 = new Manager("Ivan", "Petrov", 1);
        Director director = new Director("Sergey", "Frolov", 5);

        Employee[] employees = {worker1, worker2, worker3, manager1, manager2, director};
        Manager[] managers = {manager1, manager2, director};

        utils.findEmployee(employees, "Anna");
        utils.findEmployeeByPartWord(employees, "e");
        System.out.println(utils.findTotalSalary(employees));
        System.out.println(utils.findMinSalary(employees));
        System.out.println(utils.findMaxSalary(employees));
        System.out.println(utils.findMinSubordinates(managers));
        System.out.println(utils.findMaxSubordinates(managers));
        System.out.println(utils.findMaxBonus(managers));
        System.out.println(utils.findMinBonus(managers));
   }
}
