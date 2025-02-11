package com.training.service;

import com.training.model.entity.Training;
import com.training.repository.TrainingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TrainingServiceImpl implements TrainingService{
    private final TrainingRepository trainingRepository;
    @Override
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }
}
