import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class MainApp {

	static EntityManager em = Entity.getEntity();
	
	public static void main(String[] args) {
		
		//InsertData.insertDetails();
		
		em.getTransaction().begin();
		
		System.out.println("Query 1");
		Query query1 = em.createQuery("select MAX(e.salary) from Employee e");
		Integer max_sal = (Integer) query1.getSingleResult();
		System.out.println("Max Salary is "+ max_sal); 
			 
		
		System.out.println("Query 2");
		Query query2 = em.createQuery("Select e from Employee e ");  
		List<Employee> list=(List<Employee>)query2.getResultList();  
         
        System.out.print("E_Id");  
        System.out.print("\t Name");  
        System.out.println("\t Salary");
        System.out.println("\t Dept");
          
        for( Employee e : list )
        {  
           System.out.print( e.getEid( ));  
           System.out.print("\t" +  e.getName( ));  
          System.out.print("\t" + e.getSalary( ));  
          System.out.println("\t" + e.getDept());  
        }
        
        
        System.out.println("Query 3");
        Query query3 = em.createQuery("select e from Employee e where e.salary BETWEEN 40000 and 60000");
		List<Employee> list1 = query3.getResultList();
		System.out.println("\nEmployee with salary between 40000 abd 60000\n");
		for(Employee e: list1) {
			  System.out.print( e.getEid( ));  
	          System.out.print("\t" +  e.getName( ));  
	          System.out.print("\t" + e.getSalary( ));  
	          System.out.println("\t" + e.getDept()); 
		}
	
		System.out.println("Query 4");
		Query query4 = em.createQuery("select e from Employee e where salary in(select MAX(e1.salary) from Employee e1 group by e1.dept)");
		List<Employee> list2 = query4.getResultList();
		for(Employee e: list2) {
			  System.out.print( e.getEid( ));  
	          System.out.print("\t" +  e.getName( ));  
	          System.out.print("\t" + e.getSalary( ));  
	          System.out.println("\t" + e.getDept()); 
		}
        
         em.getTransaction().commit();  

	}

}
