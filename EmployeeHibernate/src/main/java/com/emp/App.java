package com.emp;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emp.dao.EmployeeDAO;
import com.emp.pojo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/emp/resource/Beans.xml");
    	EmployeeDAO edao=(EmployeeDAO)ctx.getBean("bdao");
    	Scanner sc=new Scanner(System.in);
    	char c;
		do
    	{
    	System.out.println("Select 1)InsertEmployee 2)Update 3)Delete 4)View 5)ViewAll Employees ");
    	System.out.println("Enter The Choice");
    	int choice=sc.nextInt();
    	if(choice==1)
    	{
    		Employee e=new Employee();
        	System.out.println("Enter Employee Id");
        	int eid=sc.nextInt();
        	System.out.println("Enter Employee Name");
        	String name=sc.next();
        	System.out.println("Enter Salary");
    		int salary=sc.nextInt();
        	e.setEid(eid);
        	e.setName(name);
        	e.setSalary(salary);
        	edao.insertEmp(e);
        	System.out.println("Inserted Successfully");
        }
    	else if(choice==2)
    	{
    		System.out.println("Enter Employee Id To Update");
        	int eid=sc.nextInt();
        	System.out.println("Enter Employee Name");
        	String name=sc.next();
        	edao.updateEmp(eid, name);
        	System.out.println("Updated Successfull");
    	}
    	else if(choice==3)
    	{
    		System.out.println("Enter Employee Id To Delete");
        	int eid=sc.nextInt();
        	edao.deleteEmp(eid);
        	System.out.println("Deleted Succesfull");
    	}
    	else if(choice==4)
    	{
    		System.out.println("Enter Employee Id To View");
        	int eid=sc.nextInt();
        	Employee e=edao.getEmp(eid);
        	System.out.println(e);
    	}
    	else if(choice==5)
    	{
    		List<Employee> e=edao.getAllEmp();
    		for(Employee e1:e)
    		{
    			System.out.println(e1);
    		}
    	}
    	else
    	{
    		System.err.println("In-Valid Options");
    	}
    	System.out.println("Do You Want To Countinue");
    	c=sc.next().charAt(0);
    	}while(c=='y');
    }
}
