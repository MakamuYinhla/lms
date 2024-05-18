package za.ac.tut.group.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Video;
import za.ac.tut.group.lms.repository.VideoRepository;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public void addVideo(Video vid){
        videoRepository.save(vid);
    }

}
