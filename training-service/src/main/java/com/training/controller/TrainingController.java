package com.training.controller;

import com.training.model.entity.Training;
import com.training.service.TrainingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/trainings")
public class TrainingController {
    private final TrainingService trainingService;

    @GetMapping
    public List<Training> showAllTrainings() {
        return trainingService.getAllTrainings();
    }
}
