package za.ac.tut.group.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.tut.group.lms.models.Student;
import za.ac.tut.group.lms.repository.customRepository.StudentOtherQueriesRepository;
// import za.ac.tut.group.lms.repository.customRepository.StudentOtherQueriesRepositoryImp;
;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, StudentOtherQueriesRepository{
    
}
