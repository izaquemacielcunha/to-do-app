package com.izaquecunha.todoapp.service;

import java.util.List;

import com.izaquecunha.todoapp.dto.StatusDto;

public interface StatusService {
	List<StatusDto> getAll();
	StatusDto findByName(String name);

}// end of interface
