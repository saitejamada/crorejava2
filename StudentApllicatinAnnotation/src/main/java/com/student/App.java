package com.student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.bean.Student;
import com.student.config.StudentConfig;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(StudentConfig.class);
        Student st=(Student) ctx.getBean(Student.class);
        System.out.println(st);
    }
}
