package com.training.controller;

import com.training.model.dto.CreateCourseDTO;
import com.training.model.entity.Course;
import com.training.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/category/{name}")
    public List<Course> getCoursesByCategory(@PathVariable String name) {
        return courseService.getCoursesByCategory(name);
    }

    //TODO Get course by name / id
    // Get course by author
    // Get all courses, pagination
    @PostMapping("/create")
    public ResponseEntity<Course> createCourse(@RequestBody CreateCourseDTO createCourseDTO) {
        return ResponseEntity.ok(courseService.createCourse(createCourseDTO.title(), createCourseDTO.description(),
                createCourseDTO.category(), createCourseDTO.duration()));
    }
}
