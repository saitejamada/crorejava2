package com.railway.sevlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.railway.dao.RailwayDAo;
import com.railway.pojo.User;

/**
 * Servlet implementation class Registerservlet
 */

public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registerservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String name=request.getParameter("name");
		String no=request.getParameter("mbno");
		String age=request.getParameter("age");
		String pass=request.getParameter("pass");
		User u=new User();
		u.setName(name);u.setNumber(no);u.setAge(age);u.setPassword(pass);
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/railway/resource/Beans.xml");
		RailwayDAo edao=(RailwayDAo)ctx.getBean("bdao");
		edao.inserUser(u);
	}

}
