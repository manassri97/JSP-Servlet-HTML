import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Entity {

	public static EntityManager getEntity()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee");  
	    EntityManager em=emf.createEntityManager();  
	    return em; 
	}
	
}
