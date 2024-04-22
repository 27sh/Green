package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dao.INoticeDao;
import dto.NoticeDto;
import utill.MybatisSqlSessionFactory;

public class NoticeService {
	
	private SqlSessionFactory sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
	
	private SqlSession session = sqlSessionFactory.openSession(true);
	private INoticeDao noticeDao = session.getMapper(INoticeDao.class);
	
	public List<NoticeDto> getNoticeList(){
		List<NoticeDto> noticeList = noticeDao.getNoticeList();
		
		return noticeList;
	}
	
	public void registNotice(NoticeDto notice) {
		noticeDao.saveNotice(notice);
	}

	public NoticeDto getNotice(int nno) {
		NoticeDto noticeDto = noticeDao.getNotice(nno);
		
		return noticeDto;
	}
}
