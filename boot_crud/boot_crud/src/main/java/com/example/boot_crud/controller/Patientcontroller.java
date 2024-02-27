package com.example.boot_crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boot_crud.dao.PatientDao;
import com.example.boot_crud.dto.PatientDto;


@Controller
public class Patientcontroller {
	
	@Autowired
	PatientDao dao;
	@RequestMapping("/inserthtml")
	
	public String insertHtml()
	{
		return "insert.html";
	}
	@PostMapping("/insert")
     @ResponseBody
	public String insertingData(@ModelAttribute PatientDto dto)
	{
		System.out.println(dto);
		dao.insertData(dto);
		return " data inserted successfully";
	}

}
