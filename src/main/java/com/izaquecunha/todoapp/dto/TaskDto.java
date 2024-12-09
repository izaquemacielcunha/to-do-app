package com.izaquecunha.todoapp.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TaskDto {
	private Integer id;
	@NotEmpty(message = "This field is required")
	private String name;
	private String description;
	private StatusDto status;
	private LocalDateTime createdOn;

}// end of class
