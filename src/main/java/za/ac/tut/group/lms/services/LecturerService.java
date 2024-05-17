package za.ac.tut.group.lms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import za.ac.tut.group.lms.models.Lecturer;
import za.ac.tut.group.lms.repository.LecturerRepository;

@Service
public class LecturerService {
<<<<<<< HEAD

  @Autowired
  private final LecturerRepository lecturerRepository;
=======
    
    @Autowired
    private final LecturerRepository lecturerRepository;
>>>>>>> 72b5342d0291a24ee6f90147bbada7b5741696e2

    public LecturerService(LecturerRepository lecturerRepository) {
        this.lecturerRepository = lecturerRepository;
    }

<<<<<<< HEAD
    public void addLecturer(Lecturer lecturer){
      lecturerRepository.save(lecturer);
    }

    public boolean authorizeLecturerAccess(Lecturer lecturer){
      return lecturerRepository.authorizeLecturer(lecturer);
    }
  
=======
    public void addNewLecturer(Lecturer lecturer){
        lecturerRepository.save(lecturer);
    }
>>>>>>> 72b5342d0291a24ee6f90147bbada7b5741696e2
}
