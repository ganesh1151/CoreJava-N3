package org.tnsif.service;
import java.util.List;
import org.tnsif.entity.Employee;
//service layer
public interface EmployeeService {
	
	//abstract method for CRUD operation
	public boolean addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public boolean deleteEmployee(int userid);
	public Employee getEmployee(int userid);
	public List<Employee>getAll();

}