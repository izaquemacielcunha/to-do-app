package com.izaquecunha.todoapp.mapper;

import com.izaquecunha.todoapp.entity.Status;
import com.izaquecunha.todoapp.dto.StatusDto;

public class StatusMapper {

	public static Status mapToStatus(StatusDto statusDto) {
		Status status = Status.builder()
				.id(statusDto.getId())
				.name(statusDto.getName())
				.description(statusDto.getDescription())
				.build();
		return status;
	}

	public static StatusDto  mapToStatusDto(Status status) {
		StatusDto statusDto = StatusDto.builder()
				.id(status.getId())
				.name(status.getName())
				.description(status.getDescription())
				.build();
		return statusDto;
	}
	
}// end of class
