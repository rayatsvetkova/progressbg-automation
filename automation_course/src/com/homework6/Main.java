package com.homework6;

public class Main {
    public static void main(String[] args) {
        //Task 1
        executeTask1();

        //Task 2
        executeTask2();

        //Task 3
        executeTask3();

    }

    public static void executeTask3() {
        //Creating two objects from type employee
        Employee employee1 = new Employee("Ivan", "Dimitrov", 1000);
        Employee employee2 = new Employee("Georgi", "Petkov", 1100);

        //Creating an array
        Employee arr[]={employee1,employee2};

        // Print average salary
        System.out.println("Average salary is: " + averageSalary(arr));
    }

    public static void executeTask2() {
        //Create objects and add them to the array with circles
//        Circle circle1 = new Circle();
//        Circle circle2 = new Circle();
//        Circle circle3 = new Circle();
//        Circle circle4 = new Circle();
//        Circle circle5 = new Circle();
//        Circle circle6 = new Circle();
//        Circle circle7 = new Circle();
//        Circle circle8 = new Circle();
//        Circle circle9 = new Circle();
//        Circle circle10 = new Circle();
//        Circle circles[] = {circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10};

        //Second way of doing the previous: using for loop to create the objects and add them into the array
        Circle circles[] = new Circle[10];
        for (int i = 0; i < 10; i++) {
            circles[i] = new Circle();
        }

        double areas[] = areasOfAllCircles(circles);
        for (int i = 0; i < areas.length; i++) {
            System.out.println(areas[i]);
        }

        double maximum = maximumAreaOfCircle(areas);
        System.out.println("The maximum is: " + maximum);
    }

    public static void executeTask1() {

        //Creating employees
        Employee employee1 = new Employee("Ivan", "Dimitrov",1000);
        Employee employee2 = new Employee("Dimitar", "Grigorov",1234.7);
        Employee employee3 = new Employee("Petar", "Nikolov",1756);
        Employee employee4 = new Employee("Kalina", "Marinova",3114);
        Employee employee5 = new Employee("Raya", "Tsvetkova",2320.5);

        // Creating arrays with employees for the different teams
        Employee employeesHR[] = {employee1, employee2};
        Employee employeesFinance[] = {employee3};
        Employee employeesAdministration[] = {employee4, employee5};


        // Creating teams
        Team team1 = new Team(employeesHR, "HR");
        Team team2 = new Team(employeesFinance, "Finance");
        Team team3 = new Team(employeesAdministration, "Administration");
        Team teams[] = {team1, team2, team3};


        //Creating and initialising company Momo
        Company company = new Company(teams, "Momo");
        System.out.println("\n");

        //Print the names of the teams in the company
        company.printTeamNames();
        System.out.println("\n");

        // Print the employees in team HR
        company.printEmployeesTeam("HR");
        System.out.println("\n");

        //Print all the employees in the company Momo
        company.printAllEmployees();
    }

    //Calculate all the areas
    public static double[] areasOfAllCircles(Circle circles[]) {
        double areas[] = new double[10];
        for (int i = 0; i < circles.length; i++) {
            areas[i] = circles[i].areaOfCircle();
        }
        return areas;
    }

    //Find the maximum Circle
    public static double maximumAreaOfCircle(double arr[]) {
        double maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            double currentElement = arr[i];
            if (maximum < currentElement) {
                maximum = currentElement;
            }
        }
        return maximum;
    }

    public static double averageSalary(Employee employees[]){
        double sum=0;
        for(int i=0;i<employees.length;i++){
          sum = sum +  employees[i].getSalary();
        }
        return sum / employees.length;

    }
}