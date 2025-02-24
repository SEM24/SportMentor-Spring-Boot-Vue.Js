package com.training.controller;

import com.training.model.entity.Category;
import com.training.service.CategoryService;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;
    //TODO pagination everywhere
    @GetMapping
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestParam @NotNull @NotEmpty String name) {
        return ResponseEntity.ok(categoryService.createCategory(name));
    }

    @GetMapping("/{name}")
    public Category getCategoryByName(@PathVariable @NotNull @NotEmpty String name) {
        return categoryService.getCategoryByName(name);
    }
}
