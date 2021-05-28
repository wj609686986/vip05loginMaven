package com.testing.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 设置请求的编码格式
		request.setCharacterEncoding("utf-8");

		// 设置返回的编码格式
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		// 获取请求中user和pwd的值
		String userValue = request.getParameter("user");
		String pwdValue = request.getParameter("pwd");
//		pwdValue.equals("jie");

		// 修改response返回内容
		response.getWriter().append("Served at: ").append(request.getContextPath()).append("roy的第一个项目的用户名和密码是：")
				.append(userValue + pwdValue);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		// 设置请求的编码格式
		request.setCharacterEncoding("utf-8");
		// 设置返回的编码格式utf-8以及contentType格式html格式，utf-8编码
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//从form表单的请求里面获取user/pwd/爱吃的菜
		String userPost = request.getParameter("user");
		String pwdPost = request.getParameter("pwd");
		String favorDish = request.getParameter("爱吃的菜");
		
		String loginMsg = "";
		if((new String("roy")).equals(userPost)&&(new String("123456")).equals(pwdPost)) {
			loginMsg = "{\"statusCode\":\"1\",\"msg\":\"老婆我爱你！\"}";
		}
		else {
			loginMsg = "{\"statusCode\":\"0\",\"msg\":\"登录失败！\"}";
		}
		
		response.getWriter().append(loginMsg);

	}

}
