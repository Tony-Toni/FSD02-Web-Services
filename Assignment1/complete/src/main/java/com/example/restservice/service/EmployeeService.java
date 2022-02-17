package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmps() {
        Employee emp1 = new Employee(1, "John", "Doe", new Address(123,"Amiable"));
        Employee emp2 = new Employee(2, "Marry", "Lamb", new Address(456,"Bravo"));
        Employee emp3 = new Employee(3, "Kate", "Green", new Address(123,"Chanson"));

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public Employee getById(int id) {
        for (Employee e: employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}
