package za.ac.tut.group.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Lesson;
import za.ac.tut.group.lms.repository.LessonRepository;

@Service
public class LessonService {
    @Autowired
    private LessonRepository lessonRepository;

    public LessonService(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    public void addNewLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public List<Lesson> findAllLessons() {
        return lessonRepository.findAll();
    }

    public List<Lesson> findAllByModuleId(Long id) {
        List<Lesson> lessons = lessonRepository.findAll();
        for (Lesson lesson : lessons) {
            if (lesson.getModuleId().getModuleId() != id) {
                lessons.remove(lesson);
            }
        }

        return lessons;
    }

}
