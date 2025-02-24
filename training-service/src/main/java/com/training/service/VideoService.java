package com.training.service;

import com.training.model.dto.UploadVideoDTO;
import com.training.model.entity.Video;

public interface VideoService {
    Video uploadVideo(UploadVideoDTO uploadVideoDTO);
}
