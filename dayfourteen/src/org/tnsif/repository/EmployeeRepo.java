package org.tnsif.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsif.entity.Employee;

public interface EmployeeRepo {
	
	//crud user-defined method
	Statement createStatement();
	PreparedStatement createPrepare(String query);
	int addQuery(String query, Employee employee);
	int updateQuery(String query, Employee employee);
	int deleteQuery(String query);
	public ResultSet retreiveQuery(String query);


}