package com.charan.spring.jpa.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.charan.spring.jpa.h2.employeeservice1.EmployeeService1;
import com.charan.spring.jpa.h2.model.Employee;

import java.util.List;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
//mark class as Controller  
@RestController  
public class EmployeeController   
{  
@Autowired  
EmployeeService1 employeeService;  
//creating a get mapping that retrieves all the books detail from the database   
@GetMapping("/emp")  
private List<Employee> getAllEmployees()   
{  
return employeeService.getAllBooks() ;
}  
//creating a get mapping that retrieves the detail of a specific book  
@GetMapping("/emp/{empid}")  
private Employee getBooks(@PathVariable("empid") int empid)   
{  
return employeeService.getBooksById(empid);  
}  
//creating a delete mapping that deletes a specified book  
@DeleteMapping("/emp/{empid}")  
private void deleteBook(@PathVariable("empid") int empid)   
{  
	employeeService.delete(empid);  
}  
//creating post mapping that post the book detail in the database  
@PostMapping("/employees")  
private int saveBook(@RequestBody Employee employees)   
{  
	employeeService.saveOrUpdate(employees);  
	return employees.getEmpid();  
}  
//creating put mapping that updates the book detail   
@PutMapping("/employees")  
private Employee update(@RequestBody Employee employees)   
{  
	employeeService.saveOrUpdate(employees);  
	return employees;  
}  
}  