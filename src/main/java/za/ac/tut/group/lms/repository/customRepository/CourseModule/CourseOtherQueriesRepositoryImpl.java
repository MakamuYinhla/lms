// package za.ac.tut.group.lms.repository.customRepository.CourseModule;

// import java.util.List;

// import org.springframework.stereotype.Repository;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;
// import jakarta.persistence.TypedQuery;
// import za.ac.tut.group.lms.models.CourseModule;

// @Repository
// public class CourseOtherQueriesRepositoryImpl implements CourseOtherQueriesRepository{

//   @PersistenceContext
//     private EntityManager entityManager;

//     public EntityManager getEntityManager(){
//       return entityManager;
//     }
    
//     @Override
//     public List<CourseModule> allModulesAvail() {
//       TypedQuery<CourseModule> sql = getEntityManager().createQuery("SELECT u.moduleName FROM CourseModule u ", CourseModule.class);
      
//       return (List<CourseModule>)sql.getResultList();
//     }
  
// }
