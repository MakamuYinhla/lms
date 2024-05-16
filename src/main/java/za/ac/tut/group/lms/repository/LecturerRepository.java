package za.ac.tut.group.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.tut.group.lms.models.Lecturer;


@Repository
public interface LecturerRepository extends JpaRepository<Lecturer, Long>{
    
}
