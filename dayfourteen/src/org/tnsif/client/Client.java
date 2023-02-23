package org.tnsif.client;

import java.util.List;
import java.util.Scanner;

import org.tnsif.entity.Employee;
import org.tnsif.service.EmployeeService;
import org.tnsif.service.EmployeeServiceImpl;

//driver class
public class Client {

	public static void main(String[] args) {
		int choice;
		EmployeeService service=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter the choice: ");
			System.out.println("1.Insert "+"2.update"+"3.delete"+"4.retriveall"+
			"5.retreive"+ "\n-1: exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter the details of employee");
				Employee employee=new Employee(sc.nextInt(),sc.next(),sc.next(),sc.next());
				if(service.addEmployee(employee))
				{
					System.out.println("added successfully");
				}
				else
				{
					System.out.println("details not found");
				}
			}
			break;
			case 2:
			{
				System.out.println("enter the userid whose details want to update");
				Employee employee=new Employee();
				employee.setUserid(sc.nextInt());
				System.out.println("enter the updated details: ");
				//sc.nextLine();
				employee.setPassword(sc.next());
				Employee emp=service.updateEmployee(employee);
				
				if(emp!=null)
				{
					System.out.println(emp);
				}
				else
				{
					System.out.println("not updated");
				}
			}
			break;
			case 3:
			{
				System.out.println("Enter the UID of employee");
				boolean success=service.deleteEmployee(sc.nextInt());
				if(success)
				{
					System.out.println("deleted");
				}
				else
				{
					System.out.println("data not found");
				}
			}
			break;
			case 4:
			{
				List<Employee>emp=service.getAll();
				//System.out.println(emp);
				for(Employee e1:emp)
					System.out.println(e1);
				
			}
			break;
			case 5:
			{
				System.out.println("Enter the id that u want to show: ");
				Employee employee;
				try
				{
					employee=service.getEmployee(sc.nextInt());
					
				}
				catch(Exception e)
				{
					employee=null;
					System.out.println(e);
				}
				if(employee!=null)
				{
					System.out.println(employee);
				}
				else
				{
					System.out.println("data not found");
				}
			}
			break;
			case -1:
				System.out.println("thank you");
			}
			}while(choice>0);
			
			
	}
			
			
		
	

}