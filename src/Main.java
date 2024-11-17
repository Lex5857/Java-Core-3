package javaCore.Lesson3.src;

import java.time.LocalDate;

import javaCore.Lesson3.src.builder.HumanBuilder;
import javaCore.Lesson3.src.director.Director;
import javaCore.Lesson3.src.employee.Employee;
import javaCore.Lesson3.src.employeeRegistry.EmployeeRegistry;
import javaCore.Lesson3.src.employee.Gender;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeRegistry<Employee> employeeRegistry = new EmployeeRegistry();
        HumanBuilder builder = HumanBuilder.getHumanBuilder();

        Employee employee1 = builder.employeeBuild("Вася", Gender.MALE, addDateOfBirth("02.10.2000"), 40000);
        Employee employee2 = builder.employeeBuild("Алексей", Gender.MALE, addDateOfBirth("15.05.1990"), 85000);
        Director director = builder.directorBuild("Татьяна", Gender.FEMALE, addDateOfBirth("22.03.1989"), 200000);

        employeeRegistry.addEmployee(employee1);
        employeeRegistry.addEmployee(employee2);
        employeeRegistry.addEmployee(director);

        employeeRegistry.sortByDateOfBirth();

        setUpSalaryPercent(5, employeeRegistry.getEmployees());

        System.out.println(employeeRegistry.getEmployeesListInfo());
    }

    private static LocalDate addDateOfBirth(String dateOfBirthStr){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            return LocalDate.parse(dateOfBirthStr, formatter);
        } catch (DateTimeParseException e){
            return null;
        }
    }

    public static void setUpSalaryPercent(int percent, List<Employee> employees){
        for (Employee employee: employees){
            if ( employee  instanceof Employee) {
                int salary = employee.getSalary();
                salary = salary + salary / 100 * percent;
                employee.setSalary(salary);
            }
        }
    }
}
