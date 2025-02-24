package com.training.service;

import com.training.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();

    Category createCategory(String name);

    Category getCategoryByName(String name);
}
