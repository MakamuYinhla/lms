package za.ac.tut.group.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Course;
import za.ac.tut.group.lms.repository.CourseRepository;

@Service
public class SearchCourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course getByIdCourses(Long id) {
        @SuppressWarnings("deprecation")
        Course course = courseRepository.getById(id);
        return course;
    }
}
