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
		// 封装数据
		User user = new User(name,psw);
		// 使用业务逻辑层的功能(查)
		UserService userService=new UserService();
		boolean flag=userService.queryUser(user);
		//响应编码
		response.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		if(flag) {
			out.println("登陆成功");
		}else{
			out.println("账号或密码错误");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
