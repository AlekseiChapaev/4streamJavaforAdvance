package hw_9_2;

public class Main {

    public static void main(String[] args) {

        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();
        worker1.setName("Oleg");
        worker2.setName("Anna");
        worker3.setName("Petr");
        Worker[] workers = {worker1, worker2, worker3};

        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        Director director = new Director();
        manager1.setName("Alex");
        manager2.setName("Oleg");
        director.setName("Sergey");
        manager1.setNumberOfSubordinates(2);
        manager2.setNumberOfSubordinates(1);
        director.setNumberOfSubordinates(5);

        Employee[] arrayEmployees = {worker1, worker2, worker3, manager1, manager2, director};
        Manager[] managers = {manager1, manager2};

        System.out.println(Helpers.findEmployeeByName(workers, "Anna"));
        System.out.println(Helpers.findEmployeeByPartName(arrayEmployees, "lex"));
        System.out.println(Helpers.getSalaryEmployees(arrayEmployees));
        System.out.println(Helpers.getMinSalary(arrayEmployees));
        System.out.println(Helpers.getMaxSalary(arrayEmployees));
        System.out.println(Helpers.getMinSub(managers));
        System.out.println(Helpers.getMaxSub(managers));
        System.out.println(Helpers.getMinBonus(managers));
        System.out.println(Helpers.getMaxBonus(managers));
    }
}
