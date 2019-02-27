import javax.persistence.EntityManager;

public class InsertData {

	static EntityManager em = Entity.getEntity();

	public static void insertDetails()
	{
		em.getTransaction().begin(); 
		Employee e = new Employee();
		e.setName("manas");
		e.setSalary(50000);
		e.setDept("HR");
		
		Employee e1 = new Employee();
		e1.setName("naman");
		e1.setSalary(40000);
		e1.setDept("HR");
		
		Employee e2 = new Employee();
		e2.setName("yatharth");
		e2.setSalary(30000);
		e2.setDept("CSE");
		
		Employee e3 = new Employee();
		e3.setName("yanshu");
		e3.setSalary(70000);
		e3.setDept("ECE");
		
		 em.persist(e);  
	     em.persist(e1);  
	     em.persist(e2);     
	     em.persist(e3);
	     
	     em.getTransaction().commit();
	}
}