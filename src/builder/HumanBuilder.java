package javaCore.Lesson3.src.builder;

import java.time.LocalDate;

import javaCore.Lesson3.src.director.Director;
import javaCore.Lesson3.src.employee.Employee;
import javaCore.Lesson3.src.employee.Gender;

public class HumanBuilder{
    private static HumanBuilder humanbuilder;
    protected int genId;

    public static HumanBuilder getHumanBuilder(){
        if (humanbuilder == null){
            humanbuilder = new HumanBuilder();
        }
        return humanbuilder;
    }

    public Employee employeeBuild(String name, Gender gender, LocalDate dateOfBirth, int salary){
        return new Employee(genId++, name, gender, dateOfBirth, salary);
    }

    public Director directorBuild(String name, Gender gender, LocalDate dateOfBirth, int salary){
        return new Director(genId++, name, gender, dateOfBirth, salary);
    }
}

