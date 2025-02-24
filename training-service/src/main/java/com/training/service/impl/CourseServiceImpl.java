package com.training.service.impl;

import com.training.config.FakeSecurityContext;
import com.training.exception.ResourceNotFoundException;
import com.training.model.entity.Category;
import com.training.model.entity.Course;
import com.training.repository.CategoryRepository;
import com.training.repository.CourseRepository;
import com.training.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepository courseRepository;
    private final CategoryRepository categoryRepository;
    private final FakeSecurityContext fakeSecurityContext;
    @Override
    public List<Course> getCoursesByCategory(String categoryName) {
        if (categoryRepository.findByName(categoryName).isEmpty()) {
            throw new ResourceNotFoundException("Category not found with name: " + categoryName);
        }
        return courseRepository.findByCategory_Name(categoryName);
    }

    @Override
    public Course createCourse(String title, String description, String categoryName, int durationMinutes) {
        Category category = categoryRepository.findByName(categoryName)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with name: " + categoryName));

//        if (!fakeSecurityContext.isAuthor()) {
//            throw new ForbiddenException("Only authors can create courses");
//        }

        Course course = new Course();
        course.setTitle(title);
        course.setDescription(description);
        course.setDurationMinutes(durationMinutes);
        course.setCategory(category);
        course.setAuthor(fakeSecurityContext.getCurrentUser()); 

        return courseRepository.save(course);
    }
    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));
    }
}
