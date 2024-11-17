package javaCore.Lesson3.src.employee;

import java.time.LocalDate;

import javaCore.Lesson3.src.employeeRegistry.ItemEmployeeRegistry;

public class Employee implements ItemEmployeeRegistry{
    private int id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
    private int salary;

    public Employee(int id, String name, Gender gender, LocalDate dateOfBirth, int salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        String employeeInfo = "";
        employeeInfo += "<" + name + ">"
        + "<" + gender + ">"
        + "<" + dateOfBirth + ">"
        + "<" + salary + ">" + System.lineSeparator();
        return employeeInfo;
    }
}
