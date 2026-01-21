package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class EmployeeController {

    private List<Employee> employeeList = new ArrayList<>();

    // dummy data (optional)
    public EmployeeController() {
        employeeList.add(new Employee(1, "Ananya", "Intern"));
        employeeList.add(new Employee(2, "Rahul", "Manager"));
    }

    // ✅ GET all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // ✅ POST add employee
    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
        return "Employee Added Successfully ✅";
    }
}
