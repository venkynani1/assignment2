
package com.springboot1.assignment.main.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springboot1.assignment.main.model.Course;
import com.springboot1.assignment.main.exception.InvalidIdException;

import com.springboot1.assignment.main.repository.CourseRepository;

@Service
public class Courseservice {

	@Autowired
	private CourseRepository courserepository; 
	
	public Course addcourse(Course course) {
		return courserepository.save(course);
	}
	public List<Course> getAllCourses()
	{
		return courserepository.findAll();
	}
	public Course getSingleCourse(int id)  throws InvalidIdException{
		Optional<Course> optional = courserepository.findById(id);
		if(optional.isEmpty())
		
			throw new InvalidIdException("ID given is Invalid...");
		
		return optional.get();
		
		
	}
}



