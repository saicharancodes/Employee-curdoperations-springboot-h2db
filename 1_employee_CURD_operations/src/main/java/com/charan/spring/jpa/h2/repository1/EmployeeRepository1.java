package com.charan.spring.jpa.h2.repository1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.charan.spring.jpa.h2.model.Employee;



@Repository  
//repository that extends CrudRepository  
public interface EmployeeRepository1 extends CrudRepository<Employee, Integer>  
{  
}  