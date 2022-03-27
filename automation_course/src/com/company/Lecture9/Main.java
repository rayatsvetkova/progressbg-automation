package com.company.Lecture9;

public class Main {
    public static void main(String[] args) {
        // Exercise 1
        exercise1();


        Teacher teacher1 = new Teacher(38,170,"Grigorova", "Math");
        Student student1 = new Student(15, 150, "Marti", new String[]{"Math", "Geography"});
        Student student2 = new Student(16, 154, "Marti", new String[]{"Math", "History"});
        Student student3 = new Student(13, 160, "Marti", new String[]{"Math", "Literature"});
        Person[] persons = {teacher1,student1,student2,student3};
        System.out.println("The average age is: " + getAverageAge(persons));

    }

    public static double getAverageAge(Person[] persons){
        double average;
        double sumAge =0;
        for (int i = 0; i <persons.length ; i++) {
            sumAge = sumAge + persons[i].getAge();

        }
        average=sumAge/persons.length;
        return average;
    }

    public static void exercise1() {
        GeometryFigure figure = new Circle(1);
        System.out.println(figure.getArea());

        figure = new Rectangle(1, 2);
        System.out.println(figure.getArea());

        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.getArea());

        figure.getArea();
        rectangle.getA();

        GeometryFigure[] figures = new GeometryFigure[4];
        figures[0] = new Rectangle(2,3);
        figures[1] = new Circle(1);
        figures[2] = new Square(5);
        figures[3] = new Square(10);

        double maxArea = findMaxArea(figures);
        System.out.println("Max area is: " + maxArea);
    }


    public static double findMaxArea(GeometryFigure[] figures) {
        double maxArea = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null && maxArea < figures[i].getArea()) {
                maxArea = figures[i].getArea();
            }

        }
        return maxArea;
    }
}
