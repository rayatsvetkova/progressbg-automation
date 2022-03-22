package com.homework6;

public class Team {
    private Employee employees[];
    private String teamName;

    public Team(Employee[] employees, String teamName) {
        this.employees = employees;
        this.teamName = teamName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void printEmployeesOfTeam() {
        System.out.println("Team name is: " + teamName);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee name is: " + employees[i].getFirstName() + "\n" +
                    "Employee's salary is: " + employees[i].getSalary());
        }
    }
}
