package javaCore.Lesson3.src.employeeRegistry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javaCore.Lesson3.src.employee.Employee;
import javaCore.Lesson3.src.employee.comparators.EmployeeComparatorByDateOfBirth;

public class EmployeeRegistry <E extends ItemEmployeeRegistry> implements Iterable<Employee>{
    private List<Employee> employees;

    public EmployeeRegistry() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public Employee getEmployee(int id){
        for (Employee employee: employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    public void sortByDateOfBirth(){
        employees.sort(new EmployeeComparatorByDateOfBirth<>());
    }

    @Override
    public Iterator<Employee> iterator() {
        return new EmployeeIterator<>(employees);
    }

    public String getEmployeesListInfo(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список:\n");
        for (Employee employee: employees){
            stringBuilder.append("id: " + employee.getId() + " ");
            stringBuilder.append(employee);
        }
        return stringBuilder.toString();
    }
}
