package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/regist_form.do")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("regist_form.do................");
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		
		if(id != null) {
			//admin 로그인 되어 있으면 공지사항 등록 폼이 열린다.
			response.sendRedirect("regist_form.jsp");	
		}
		else {
			response.sendRedirect("login_form.do");
		}
		
	}

}
