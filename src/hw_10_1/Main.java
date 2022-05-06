package hw_10_1;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Oleg", 10000);
        Worker worker2 = new Worker("Anna", 10000);
        Worker worker3 = new Worker("Petr", 10000);
        Manager manager1 = new Manager("Olga", 10000, 2);
        Manager manager2 = new Manager("Ivan", 10000, 1);
        Director director = new Director("Sergey", 10000, 5);

        Employee[] employees = {worker1, worker2, worker3, manager1, manager2, director};
        Manager[] managers = {manager1, manager2, director};

        Utils.getDataOfEmployeesArray(Utils.findEmployeeByName(employees, "Ivan"));
        Utils.getDataOfEmployeesArray(Utils.findEmployeeByPartName(employees, "e"));
        System.out.println("******************************************");
        System.out.println(manager1.getSalary());
        System.out.println(manager2.getSalary());
        System.out.println(director.getSalary());
        System.out.println(Utils.getSalaryOfEmployeesArray(employees));
        System.out.println("******************************************");
        System.out.println(Utils.findMaxSalary(employees));
        System.out.println(Utils.findMinSalary(employees));
        System.out.println("******************************************");
        System.out.println(Utils.findMinSubordinates(managers));
        System.out.println(Utils.findMaxSubordinates(managers));
        System.out.println("******************************************");
        System.out.println(Utils.findMinBonus(managers));
        System.out.println(Utils.findMaxBonus(managers));
    }
}
