package za.ac.tut.group.lms.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Course;
import za.ac.tut.group.lms.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository=courseRepository;
    }
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}
