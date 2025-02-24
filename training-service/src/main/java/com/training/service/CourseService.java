package com.training.service;

import com.training.model.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCoursesByCategory(String categoryName);

    Course createCourse(String title, String description, String categoryName, int durationMinutes);

    Course getCourseById(Long id);
}
