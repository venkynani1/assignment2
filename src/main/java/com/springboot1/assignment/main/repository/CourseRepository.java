package com.springboot1.assignment.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot1.assignment.main.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course,Integer>
{

}
