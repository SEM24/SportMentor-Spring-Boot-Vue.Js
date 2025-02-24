package com.training.model.dto;

import lombok.Builder;
import org.springframework.web.bind.annotation.RequestParam;
@Builder
public record UploadVideoDTO(@RequestParam String title,
                             @RequestParam String description,
                             @RequestParam String videoUrl,
                             @RequestParam Long courseId) {
}
