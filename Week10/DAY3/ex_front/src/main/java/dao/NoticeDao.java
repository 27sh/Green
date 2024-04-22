package dao;

import java.util.ArrayList;
import java.util.List;

import dto.NoticeDto;

public class NoticeDao {
	public List<NoticeDto> getNoticeList(){
		List<NoticeDto> noticeList = new ArrayList<>();
		
		NoticeDto notice1 = new NoticeDto(1, "test1", "test1....", "admin");
		NoticeDto notice2 = new NoticeDto(2, "test2", "test2....", "admin");
		NoticeDto notice3 = new NoticeDto(3, "test3", "test3....", "admin");
		NoticeDto notice4 = new NoticeDto(4, "test4", "test4....", "admin");
		NoticeDto notice5 = new NoticeDto(5, "test5", "test5....", "admin");
		
		noticeList.add(notice1);
		noticeList.add(notice2);
		noticeList.add(notice3);
		noticeList.add(notice4);
		noticeList.add(notice5);
		
		return noticeList;
	}
	
	public void  registNotice(NoticeDto notice) {
		
	}
}
