package za.ac.tut.group.lms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Student;
import za.ac.tut.group.lms.repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addNewStudent(Student student){
        studentRepository.save(student);
    }

    public boolean authorizeStudentAccess(Student student){
        return studentRepository.authorizeStudent(student);
    }
}
