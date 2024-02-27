package com.example.boot_crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.boot_crud.dto.PatientDto;
import com.example.boot_crud.repository.PatientRepository;

@Component
public class PatientDao {
@Autowired
PatientRepository repository;

public String insertData(PatientDto dto)
{
	repository.save(dto);
	return "data inserted successfully";
}
}
