package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.NoticeDto;
import service.NoticeService;

//@WebServlet("/list.do")
public class listServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	NoticeService noticeService = new NoticeService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("list.do..................");
		
		List<NoticeDto> noticeList = noticeService.getNoticeList();
		
		request.setAttribute("noticeList", noticeList);
		
		request.getRequestDispatcher("list.jsp").forward(request, response);
	}


}
