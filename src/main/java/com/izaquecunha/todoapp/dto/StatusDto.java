package com.izaquecunha.todoapp.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StatusDto {
	private Integer id;
	private String name;
	private String description;

}// end of class
