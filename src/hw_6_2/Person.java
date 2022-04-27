package hw_6_2;

public class Person {

    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // enum GendersM {m, M};
    //GendersM[] gendersM = GendersM.values();

    public String getPrefix() {
        if (gender == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }
}


























    //boolean isSameName(Employee employee) {
    //        return person.getName().equals(employee.person.getName());
    //    }


    //public static void main(String[] args) {
    //
    //        Employee employee1 = new Employee();
    //        employee1.person.setName("Vasya");
    //        Employee employee2 = new Employee();
    //        employee2.person.setName("Vasya2");
    //
    //        System.out.println(employee1.isSameName(employee2));
    //    }

