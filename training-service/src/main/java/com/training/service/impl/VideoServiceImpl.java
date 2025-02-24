package com.training.service.impl;

import com.training.exception.ForbiddenException;
import com.training.exception.ResourceNotFoundException;
import com.training.model.dto.UploadVideoDTO;
import com.training.model.entity.Course;
import com.training.model.entity.Video;
import com.training.repository.CourseRepository;
import com.training.repository.VideoRepository;
import com.training.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VideoServiceImpl implements VideoService {
    private final VideoRepository videoRepository;
    private final CourseRepository courseRepository;

    @Override
    public Video uploadVideo(UploadVideoDTO uploadVideoDTO) {
        Course course = courseRepository.findById(uploadVideoDTO.courseId())
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + uploadVideoDTO.courseId()));

        // TODO Ensure only the course author can upload videos
//        if (!course.getAuthor().equals(fakeSecurityContext.getCurrentUser())) {
//            throw new ForbiddenException("Only the course author can upload videos to this course");
//        }
        Video video = new Video();
        video.setTitle(uploadVideoDTO.title());
        video.setDescription(uploadVideoDTO.description());
        video.setVideoUrl(uploadVideoDTO.videoUrl());
        video.setCourse(course);

        return videoRepository.save(video);
    }
}
