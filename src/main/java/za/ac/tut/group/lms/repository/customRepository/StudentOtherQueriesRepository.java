package za.ac.tut.group.lms.repository.customRepository;
import za.ac.tut.group.lms.models.Student;

public interface StudentOtherQueriesRepository {
  public boolean authorizeStudent(Student stu);
}
