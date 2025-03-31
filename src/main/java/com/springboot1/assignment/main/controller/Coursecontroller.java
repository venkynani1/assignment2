package com.springboot1.assignment.main.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot1.assignment.main.dto.MessageResponseDto;
import com.springboot1.assignment.main.exception.InvalidIdException;
import com.springboot1.assignment.main.model.Course;

import com.springboot1.assignment.main.service.Courseservice;

@RestController
public class Coursecontroller{
	@Autowired
	private Courseservice courseservice;
	@GetMapping("/api/course/getall")
	public List<Course> getAllCourses()
	{
		return courseservice.getAllCourses();
	}
	@PostMapping("/api/course/add")
	public Course addcourse(@RequestBody Course course) 
	{
	
	return courseservice.addcourse(course);
}
	@GetMapping("/api/course/{id}")
	public ResponseEntity<?> getSingleCourse(@PathVariable int id) {
	    try {
	        Course course = courseservice.getSingleCourse(id);
	        return ResponseEntity.ok(course); 
	    } catch (InvalidIdException e) {
	        // Create a new MessageResponseDto instance inside the method
	        MessageResponseDto messageDto = new MessageResponseDto();
	        messageDto.setBody(e.getMessage());
	        messageDto.setStatusCode(400);
	        return ResponseEntity.status(400).body(messageDto); 
	    } 
	}

}