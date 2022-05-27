package com.emp.EmployeeAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.emp.bean.Employee;
import com.emp.config.EmployeeConfig;

public class App 
{
    public static void main( String[] args )
    {
    	// ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/emp/resource/Beans.xml"); 
    	 //Employee e=(Employee)ctx.getBean("emp");
    	 //System.out.println(e);
    	
    	ApplicationContext ctx=new AnnotationConfigApplicationContext(EmployeeConfig.class);
    	Employee e=(Employee)ctx.getBean(Employee.class);
   	 	System.out.println(e);
    
    }
}
