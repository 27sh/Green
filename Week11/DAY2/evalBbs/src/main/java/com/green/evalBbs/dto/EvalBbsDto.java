package com.green.evalBbs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvalBbsDto {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private String regdate;
}
