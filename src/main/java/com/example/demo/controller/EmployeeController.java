package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repository.EmployeeRepository;
import java.util.List;



@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://127.0.0.1:5500/")

public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    // dummy data (optional)
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    // ✅ GET all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // ✅ POST add employee
    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @DeleteMapping ("/{id}")
    public String deleteEmployee(@PathVariable Integer id) {
        employeeRepository.deleteById(id);
        return "Sucessfully Fired";
    }
}
