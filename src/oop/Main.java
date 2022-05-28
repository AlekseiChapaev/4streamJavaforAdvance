package oop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Sergei", 30, 'M');
        Person person2 = new Person("Anna", 20, 'F');

        Person[] personArray = {person, person2};

        System.out.println(person.getMinAge(personArray).getName());


        System.out.println(Week.SUNDAY.getName());
        System.out.println( Arrays.toString(Week.values()));



    }
}
