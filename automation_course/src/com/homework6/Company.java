package com.homework6;

public class Company {
    private Team teams[];
    private String companyName;

    public Company(Team[] teams,String companyName) {
        this.teams = teams;
        this.companyName=companyName;
    }

    public Team[] getTeams() {
        return teams;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void printTeamNames() {
        for (int i = 0; i < teams.length; i++) {
            System.out.println("Team name is: " + teams[i].getTeamName());
        }
    }

    public void printEmployeesTeam(String teamName) {
        for (int i = 0; i < teams.length; i++) {
            if (teams[i].getTeamName().equals(teamName)) {
                teams[i].printEmployeesOfTeam();
            }

        }
    }

    public void printAllEmployees(){
        for(int i=0;i<teams.length;i++){
            for(int j=0;j<teams[i].getEmployees().length;j++){
                System.out.println("Employee name: " + teams[i].getEmployees()[j].getFirstName());
            }
        }
    }
}
