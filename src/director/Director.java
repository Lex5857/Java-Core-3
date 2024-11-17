package javaCore.Lesson3.src.director;

import java.time.LocalDate;

import javaCore.Lesson3.src.employee.Employee;
import javaCore.Lesson3.src.employee.Gender;

public class Director extends Employee{
        
    public Director(int id, String name, Gender gender, LocalDate dateOfBirth, int salary){
        super(id, name, gender, dateOfBirth, salary);
    }

}
