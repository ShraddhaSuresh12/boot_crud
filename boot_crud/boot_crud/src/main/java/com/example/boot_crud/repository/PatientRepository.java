package com.example.boot_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.boot_crud.dto.PatientDto;
@Component
public interface PatientRepository extends JpaRepository<PatientDto, Integer>{

}
