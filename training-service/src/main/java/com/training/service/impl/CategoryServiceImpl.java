package com.training.service.impl;

import com.training.exception.BadRequestException;
import com.training.exception.ResourceNotFoundException;
import com.training.model.entity.Category;
import com.training.repository.CategoryRepository;
import com.training.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(String name) {
        if (categoryRepository.findByName(name).isPresent()) {
            throw new BadRequestException("Category with name '" + name + "' already exists");
        }
        return categoryRepository.save(new Category(null, name));
    }
    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found with name: " + name));
    }
}
