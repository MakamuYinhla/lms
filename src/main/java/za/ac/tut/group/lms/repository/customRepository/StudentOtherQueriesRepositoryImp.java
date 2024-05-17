package za.ac.tut.group.lms.repository.customRepository;
import java.util.Objects;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import za.ac.tut.group.lms.models.Student;

public class StudentOtherQueriesRepositoryImp implements StudentOtherQueriesRepository {

  @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager(){
      return entityManager;
    }

  @Override
  public boolean authorizeStudent(Student stu){
    TypedQuery<Student> sql = getEntityManager().createQuery("SELECT u FROM Student u WHERE u.studentID = :studentId AND u.password() = :stuPassword", Student.class);
    sql.setParameter(":studentId", stu.getStudentID());
    sql.setParameter(":stuPassword", stu.getPassword());

   
    
    try {
      Student result = sql.getSingleResult();
      return Objects.equals(result.getStudentID(), stu.getStudentID()) && result.getPassword().equals(stu.getPassword());

    } catch (NoResultException e) {
      return false;
    }
  }
     
  }

