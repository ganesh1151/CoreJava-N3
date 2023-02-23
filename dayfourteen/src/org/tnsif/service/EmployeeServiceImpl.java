package org.tnsif.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.tnsif.entity.Employee;
import org.tnsif.repository.EmployeeRepo;
import org.tnsif.repository.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	//insertion/creation of a row into a table
	public boolean addEmployee(Employee employee) {
		String query="INSERT INTO EMPLOYEE VALUES(?,?,?,?)";
		EmployeeRepo repo=new EmployeeRepoImpl();
		int count=repo.addQuery(query, employee);
		if(count==1)
		{
			return true;
		}
		return false;
	}

	@Override
	//update
	public Employee updateEmployee(Employee employee) {
		String query="UPDATE EMPLOYEE SET password=? WHERE (userid=?)";
		EmployeeRepo repo=new EmployeeRepoImpl();
		int count=repo.updateQuery(query, employee);
		if(count==1)
		{
			Employee e=getEmployee(employee.getUserid());
			return e;
		}
		return null;
	
	}

	@Override
	//delete
	public boolean deleteEmployee(int userid) {
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="DELETE FROM EMPLOYEE WHERE userid= "+userid;
		int count=repo.deleteQuery(query);
		if(count==1)
		{
			return true;
		}
		return false;
	}

	@Override
	//retrive with specific record
	public Employee getEmployee(int userid) {
		Employee employee=new Employee();
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="SELECT * FROM EMPLOYEE WHERE userid= "+userid;
		ResultSet rs=repo.retreiveQuery(query);
		
		try
		{
			rs.next();
			employee.setUserid(rs.getInt(1));
			employee.setUsername(rs.getString(2));
			employee.setPassword(rs.getString(3));
			employee.setEmail(rs.getString(4));

		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return employee;
	}

	@Override
	//retrive all the records
	public List<Employee> getAll() {
		List<Employee>emp=new ArrayList<Employee>();
		EmployeeRepo repo=new EmployeeRepoImpl();
		String query="SELECT * FROM EMPLOYEE";
		ResultSet rs=repo.retreiveQuery(query);
		
		try
		{
			while(rs.next());
			{
				
				Employee employee=new Employee();
				employee.setUserid(rs.getInt(1));
				employee.setUsername(rs.getString(2));
				employee.setPassword(rs.getString(3));
				employee.setEmail(rs.getString(4));
				emp.add(employee);
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return emp;
	}

}