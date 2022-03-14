package com.example.myfirstapp;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.myfirstapp.controller.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, String>{

}