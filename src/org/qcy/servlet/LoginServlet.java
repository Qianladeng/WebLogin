package org.qcy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.qcy.entity.User;
import org.qcy.service.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("uname");
		String psw=request.getParameter("upsw");
		// ��װ����
		User user = new User(name,psw);
		// ʹ��ҵ���߼���Ĺ���(��)
		UserService userService=new UserService();
		boolean flag=userService.queryUser(user);
		//��Ӧ����
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		if(flag) {
			out.println("��½�ɹ�");
		}else{
			out.println("�˺Ż��������");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
