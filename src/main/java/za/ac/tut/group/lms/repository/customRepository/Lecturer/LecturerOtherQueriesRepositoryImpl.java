package za.ac.tut.group.lms.repository.customRepository.Lecturer;
import java.util.Objects;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import za.ac.tut.group.lms.models.Lecturer;

@Repository
public class LecturerOtherQueriesRepositoryImpl implements LecturerOtherQueriesRepository {

  @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager(){
      return entityManager;
    }

  @Override
  public boolean authorizeLecturer(Lecturer lecturer){
    TypedQuery<Lecturer> sql = getEntityManager().createQuery("SELECT u FROM Lecturer u WHERE u.lecturerID = :lecturerID AND u.password = :lecPassword", Lecturer.class);
    sql.setParameter("lecturerID", lecturer.getLecturerID());
    sql.setParameter("lecPassword", lecturer.getPassword());

   
    
    try {
      Lecturer result = sql.getSingleResult();
      return Objects.equals(result.getLecturerID(), lecturer.getLecturerID()) && result.getPassword().equals(lecturer.getPassword());

    } catch (NoResultException e) {
      return false;
    }
  }
     
  }

