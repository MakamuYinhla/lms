package za.ac.tut.group.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.tut.group.lms.models.Video;


@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    
}
