package com.example.simpleBBSmybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleBBSDto {
	private int id;
	private String title;
	private String writer;
	private String content;
}
