

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("Beans.xml");
    	BookDAO bdao=(BookDAO)ctx.getBean("bdao");
    	Book b=new Book();
    	b.setBid(9001);
    	b.setName("Complete Reference to Java");
    	b.setPrice(890);
    	bdao.insertBook(b);
    	System.out.println("Book Saved Successfully");
    }
}
