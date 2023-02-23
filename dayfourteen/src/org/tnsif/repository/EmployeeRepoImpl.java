package org.tnsif.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.tnsif.dao.EmployeeDao;
import org.tnsif.entity.Employee;

public class EmployeeRepoImpl implements EmployeeRepo{
	EmployeeDao dao;
	
	
	public EmployeeRepoImpl() {
		dao=new EmployeeDao();
	}

	@Override
	public Statement createStatement() {
		Connection connection=dao.createConnection();
		Statement statement;
		try
		{
			statement=connection.createStatement();
		}
		catch(SQLException e)
		{
			statement=null;
			System.out.println("Connection issues"+e);
		}
		return statement;
	}

	@Override
	public PreparedStatement createPrepare(String query) {
		Connection connection=dao.createConnection();
		PreparedStatement statement;
		try
		{
			statement=connection.prepareStatement(query);
		}
		catch(SQLException e)
		{
			statement=null;
			System.out.println("Connection issues"+e);
		}
		return statement;
	}

	@Override
	public int addQuery(String query, Employee employee) {
		PreparedStatement statement=createPrepare(query);
		int count=0;
		try
		{
			statement.setInt(1,employee.getUserid());
			statement.setString(2,employee.getUsername());
			statement.setString(3,employee.getPassword());
			statement.setString(4,employee.getEmail());
			count=statement.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return count;
	}

	@Override
	public int updateQuery(String query, Employee employee) {
		PreparedStatement statement=createPrepare(query);
		int count=0;
		try
		{
			statement.setInt(2,employee.getUserid());
			statement.setString(1,employee.getPassword());
			//statement.setString(3,employee.getUsername());
			//statement.setString(4,employee.getEmail());

			count=statement.executeUpdate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return count;
	}

	@Override
	public int deleteQuery(String query) {
		Statement statement=createStatement();
		int count;
		try
		{
			count=statement.executeUpdate(query);
		}
		catch(Exception e)
		{
			count=0;
			System.out.println(e);
		}
		return count;
	}

	@Override
	public ResultSet retreiveQuery(String query) {
		Statement statement=createStatement();
		ResultSet rs;
		try
		{
			rs=statement.executeQuery(query);
		}
		
		catch(SQLException e)
		{
			rs=null;
			//System.out.println(e);
		}
		return rs;
	}

}