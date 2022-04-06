package com.homework7;

public class Main {
    public static void main(String[] args) {


        Human human = new Manager("Math", 40, "FB");
        Human human1 = new Employee("Raya", 23, 1000, "FB");

        System.out.println(human.getName());
        System.out.println(human.getAge());


        System.out.println(human.sayHi());
        System.out.println(human1.sayHi());




//        //creating employees and manager
//        Employee employee1 = new Employee("Tom", 34, 1000, "Google");
//        Employee employee2 = new Employee("Max", 18, 100, "Facebook");
//        Employee employee3 = new Employee("Bob", 30, 2000, "Instagram");
//        Manager manager1 = new Manager("Rob", 43, "Facebook");
//
//        Ceo ceo = new Ceo("Dan",50);
//
//        Person persons[] = {employee1, employee2, employee3, manager1,ceo};
//        System.out.println("Average age is: " + averageAge(persons));
//
//        //restriction for ceo
//        Ceo ceoRestricted = new Ceo("Peter", 35);


    }


//    public static double averageAge(Person persons[]) {
//        double average;
//        int sum = 0;
//        for (int i = 0; i < persons.length; i++) {
//            sum = sum + persons[i].getAge();
//
//        }
//        average = sum / persons.length;
//        return average;
//
//    }
}
