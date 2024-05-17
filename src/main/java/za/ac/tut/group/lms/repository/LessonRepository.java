package za.ac.tut.group.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.tut.group.lms.models.Lesson;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long>{
    
}
