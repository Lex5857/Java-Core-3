package javaCore.Lesson3.src.employeeRegistry;

import java.util.Iterator;
import java.util.List;

public class EmployeeIterator<Employee> implements Iterator<Employee>{
    private int currentId;
    private List<Employee> employees;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return employees.size() > currentId;
    }

    @Override
    public Employee next() {
        return employees.get(currentId++);
    }
}
