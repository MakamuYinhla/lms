package za.ac.tut.group.lms.repository.customRepository.Lecturer;
import za.ac.tut.group.lms.models.Lecturer;
// import za.ac.tut.group.lms.models.Student;

public interface LecturerOtherQueriesRepository {
  public boolean authorizeLecturer(Lecturer lecturer);
}
