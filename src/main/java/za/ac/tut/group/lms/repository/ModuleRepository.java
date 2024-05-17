package za.ac.tut.group.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.ac.tut.group.lms.models.CourseModule;


@Repository
public interface ModuleRepository extends JpaRepository<CourseModule, Long> {
    
}
