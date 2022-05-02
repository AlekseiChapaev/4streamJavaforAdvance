package hw_9_2_2_another_response.hw_9_2_2;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private char gender;
    private int salaryPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalary(Month[] monthArray){
        int sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += monthArray[i].getNumbersOfWorkDays() * getSalaryPerDay();
        }
        return sum;
    }

    public int getSalary(Month month){

        return month.getNumbersOfWorkDays() * getSalaryPerDay();
    }
}
