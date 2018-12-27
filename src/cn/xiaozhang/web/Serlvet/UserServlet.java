package cn.xiaozhang.web.Serlvet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.xiaozhang.Service.UserService;
import cn.xiaozhang.domain.User;

/*
 * 在servlet中依赖service，然后通过service完成功能，把结果保存到request中
 * 转发到jsp显示
 * */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			UserService userService = new UserService();
			User user = userService.find();
			
			request.setAttribute("user", user);
			
			request.getRequestDispatcher("/show.jsp").forward(request, response);
	}

	
	
}
