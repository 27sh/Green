package dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class NoticeDto {
	private int nno;
	private String title;
	private String content;
	private String writer;
	
	
}
