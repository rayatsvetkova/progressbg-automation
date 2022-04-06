package com.company.Lecture11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        examples();

        example2();

        example3();


    }

    public static void example3() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Matt", 30));
        personList.add(new Person("Ray", 75));
        personList.add(new Person("Jon", 31));
        System.out.println(personList);


        int sumAge = 0;
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
            int onePersonAge = personList.get(i).getAge();
            sumAge = sumAge + onePersonAge;
            System.out.println("Current sym age is: " + sumAge);

        }

        System.out.println("The average age is: " + sumAge / personList.size());

//        for (Person onePerson : personList) {
//            System.out.println(onePerson);
//
//        }

        System.out.println("Person with min age is: " + minAge(personList));




    }

    public static Person minAge(Collection<Person> persons) {
        Person personWithMinAge = null;
        for (Person onePerson: persons) {
            if(personWithMinAge==null){
                personWithMinAge=onePerson;
            }
            if(onePerson.getAge() < personWithMinAge.getAge()){
                personWithMinAge=onePerson;
            }

            
        }
        return personWithMinAge;
    }


    public static void example2() {
        ArrayList<String> palette = new ArrayList<>();
        palette.add("Green");
        palette.add("Orange");
        palette.add("Black");
        System.out.println(palette);
        palette.add("Red");
        System.out.println(palette);
        System.out.println("Red color is on " + palette.indexOf("Red") + " position");
        palette.remove("Orange");
        System.out.println(palette);
        System.out.println("Red color is on " + palette.indexOf("Red") + " position");
        palette.add("Orange");
        palette.add("Orange");
        palette.remove("Orange");
        System.out.println(palette);
    }

    public static void examples() {
        String[] arrayStrings = new String[]{"Bananas", "Milk", "Bread"};

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Bananas");
        shoppingList.add("Milk");
        shoppingList.add("Bread");

        System.out.println(shoppingList);
        System.out.println(shoppingList.get(0));
        System.out.println(shoppingList.indexOf("Milk"));
        shoppingList.add("Milk");
        System.out.println("Add milk again " + shoppingList);
        shoppingList.remove("Bread");
        System.out.println(shoppingList);
        shoppingList.add(1, "Bread");
        System.out.println("Add bread to index 1 " + shoppingList);
        System.out.println("This is the size of list " + shoppingList.size());
        System.out.println("Is shopping list empty " + shoppingList.isEmpty());

        ArrayList<String> removeItems = new ArrayList<>();
        removeItems.add("Bananas");
        removeItems.add("Bread");
        shoppingList.removeAll(removeItems);
        System.out.println("Removed bananas and bread " + shoppingList);
        System.out.println("Contains " + shoppingList.contains("Milk"));


        shoppingList.clear();
        System.out.println(shoppingList);
    }
}
