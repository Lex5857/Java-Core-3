package javaCore.Lesson3.src.employee.comparators;

import java.util.Comparator;

import javaCore.Lesson3.src.employeeRegistry.ItemEmployeeRegistry;

public class EmployeeComparatorByDateOfBirth<E extends ItemEmployeeRegistry> implements Comparator<E>{

    @Override
    public int compare(E o1, E o2) {
        return o1.getDateOfBirth().compareTo(o2.getDateOfBirth());
    }
}
