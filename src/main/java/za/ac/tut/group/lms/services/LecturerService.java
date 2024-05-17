package za.ac.tut.group.lms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Lecturer;
import za.ac.tut.group.lms.repository.LecturerRepository;

@Service
public class LecturerService {
    
    @Autowired
    private final LecturerRepository lecturerRepository;

    public LecturerService(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

    public void addNewLecturer(Lecturer lecturer){
        lecturerRepository.save(lecturer);
    }
}
