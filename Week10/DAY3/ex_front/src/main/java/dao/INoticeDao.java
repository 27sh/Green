package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import dto.NoticeDto;

public interface INoticeDao {
	public  List<NoticeDto> getNoticeList();
	public  void saveNotice(@Param("notice") NoticeDto notice);
	public NoticeDto getNotice(int nno);
}
