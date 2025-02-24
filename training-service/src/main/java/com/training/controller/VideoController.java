package com.training.controller;

import com.training.model.dto.UploadVideoDTO;
import com.training.model.entity.Video;
import com.training.service.VideoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/videos")
@RequiredArgsConstructor
public class VideoController {
    private final VideoService videoService;

    @PostMapping("/upload")
    //TODO change to dto
    public ResponseEntity<Video> uploadVideo(@Valid @RequestBody UploadVideoDTO uploadVideoDTO) {
        return ResponseEntity.ok(videoService.uploadVideo(uploadVideoDTO));
    }
}
