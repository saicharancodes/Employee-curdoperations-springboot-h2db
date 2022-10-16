package com.charan.spring.jpa.h2.employeeservice1;
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.charan.spring.jpa.h2.model.*;
import com.charan.spring.jpa.h2.repository1.*;  
//defining the business logic  
@Service  
public class EmployeeService1   
{  
@Autowired  
EmployeeRepository1 employeeRepository;  
//getting all books record by using the method findaAll() of CrudRepository  
public List<Employee> getAllBooks()   
{  
List<Employee> employees = new ArrayList<Employee>();  
employeeRepository.findAll().forEach(books1 -> employees.add(books1));  
return employees;  
}  
//getting a specific record by using the method findById() of CrudRepository  
public Employee getBooksById(int id)   
{  
return employeeRepository.findById(id).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public void saveOrUpdate(Employee employees)   
{  
employeeRepository.save(employees);  
}  
//deleting a specific record by using the method deleteById() of CrudRepository  
public void delete(int id)   
{  
employeeRepository.deleteById(id);  
}  
//updating a record  
public void update(Employee employees, int empid)   
{  
employeeRepository.save(employees);  
}  
}  