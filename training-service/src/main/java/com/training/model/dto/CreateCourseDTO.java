package com.training.model.dto;

import lombok.Builder;

@Builder
//TODO validate later
public record CreateCourseDTO(String title,
                              String description,
                              String category,
                              int duration) {
}
