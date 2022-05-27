package com.emp;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.emp.bean.Employee;
import com.emp.dao.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/emp/resources/Beans.xml");
    	EmployeeDao e=(EmployeeDao)ctx.getBean("edao");
    	Scanner sc=new Scanner(System.in);
    	char c;
		do {
    	System.out.println("Select  The Options 1.New Entry 2.Update 3.delete 4. view 5. view all");
    	int choice=sc.nextInt();
    	if(choice==1)
    	{
    		Employee emp=new Employee();
        	System.out.println("Enter Emp iD");
    		int s=sc.nextInt();
        	emp.setEid(s);
        	System.out.println("Enter Name");
        	String n=sc.next();
        	emp.setName(n);
        	System.out.println("Enter Salary");
        	s=sc.nextInt();
        	emp.setSalary(s);
        	System.out.println("Enter Dept Id");
        	s=sc.nextInt();
        	emp.setDid(s);
        	System.out.println("Enter Dept Name");
        	n=sc.nextLine();
        	emp.setDname(n);
        	e.saveEmp(emp);
        	System.out.println("Entered Succesfully");  	
    	}
    	else if(choice==2)
    	{
    		System.out.println("Enter Employee id");
    		int eid=sc.nextInt();
    		System.out.println("enter The Name To update");
    		String name=sc.next();
    		e.updateEmp(eid, name);
            System.out.println("updated Succesfull");
    	}
    	else if(choice==3)
    	{
    		System.out.println("Enter Employee id to delete ");
			int eid=sc.nextInt();
    		e.deleteEmp(eid);
        	System.out.println("deletetion done");
    	}
    	else if(choice==4)
    	{
    		System.out.println("Enter Employee id to display");
			int eid=sc.nextInt();
    		String empName=e.getEmpByName(eid);
        	System.out.println("Employee Name is=="+empName);
        	
    	}
    	else
    	{
    		List<Employee> list=e.getAllEmp();
        	for(Employee ep:list)
        	{
        		System.out.println(ep);
        	}
    	}
    	System.out.println("Do You Wish to continue");
    	c=sc.next().charAt(0);
    	}while(c=='y');
    }
}
