package com.charan.spring.jpa.h2.model;

 
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Employee  
{  
//Defining book id as primary key  
@Id  
@Column  
private int empid;  
@Column  
private String empname;  
@Column  
private String empadress;  
@Column  
private long phone;
public long getPhone() {
	return phone;
}
public void setPhone(long phone) {
	this.phone = phone;
}
@Column
private String empdept;
public String getEmpdept() {
	return empdept;
}
public void setEmpdept(String empdept) {
	this.empdept = empdept;
}
public int getEmpid()   
{  
return empid;  
}  
public void setEmpid(int empid)   
{  
this.empid = empid;  
}  
public String getEmpname()  
{  
return empname;  
}  
public void setEmpname(String empname)   
{  
this.empname = empname;  
}  
public String getEmpadress()   
{  
return empadress;  
}  
public void setEmpadress(String empadress)   
{  
this.empadress = empadress;  
}    
}  