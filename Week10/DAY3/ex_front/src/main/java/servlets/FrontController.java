package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.NoticeDto;
import service.NoticeService;

@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	NoticeService noticeService = new NoticeService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = null;
		
		String uri = request.getRequestURI();
		System.out.println("uri : "+uri);
		
		String contextPath = request.getContextPath();
		System.out.println("contextPath : " +contextPath);
		
		String com = uri.substring(contextPath.length());
		System.out.println("com : " +com);
		
		if(com.equals("/list.do")) {
			System.out.println("list.do.............");
			
			view = "list.jsp";
			
		}else if(com.equals("/regist_form.do")){
			System.out.println("regist_form.do.............");	
			
			view = "redirect:regist_form.jsp";
			
		}else if(com.equals("/login_form.do")) {
			System.out.println("login_form.do.............");
			
			view = "redirect:login_form.jsp";
			
		}else if(com.equals("/regist.do")) {
			System.out.println("regist.do.............");
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String writer = request.getParameter("writer");
			
			NoticeDto notice = new NoticeDto(0, title, content, writer);
			
			noticeService.registNotice(notice);
			
			
			view = "redirect:list.do";
			
		}else if(com.equals("/login.do")) {
			System.out.println("login.do.............");
			
			view = "redirect:success.jsp";
		}else if(com.equals("/detail_notice.do")) {
			System.out.println("detail_notice.do.............");
			
			String nno_ = request.getParameter("nno");
			int nno = Integer.parseInt(nno_);
			
			NoticeDto noticeDto =  noticeService.getNotice(nno);
			
			request.setAttribute("notice", noticeDto);
			
			view = "detail_notice.jsp";
		}
		
		if(view.startsWith("redirect:")){
			response.sendRedirect(view.substring(9));
		}else {
			request.getRequestDispatcher(view).forward(request, response);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
