package com.grupo03.platform.controller;

import com.grupo03.platform.model.Course;
import com.grupo03.platform.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @PostMapping
    public ResponseEntity<Course> create(@RequestBody Course course) {
        Course curso = courseRepository.save(course);
        return ResponseEntity.ok(course);
    }

    @GetMapping
    public ResponseEntity<List<Course>> detalhar(){
        List<Course> cursos = courseRepository.findAll();
        return ResponseEntity.ok(cursos);
    }
}
