package student.StudentMaven;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.student.bean.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx=new ClassPathXmlApplicationContext("/com/student/resource/Bean.xml");
       Student s=(Student)ctx.getBean("stud");
       System.out.println(s);
    }
}
