import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;  
public class MainApp {  
      
    public static void main(String args[])  
    {  
          
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("StudentDetails");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
          
        StudentEntity s1=new StudentEntity();  
        Address address=new Address();
        Address address1=new Address();
        Address address2=new Address();
        List<Address> list = new ArrayList<>();
        s1.setS_id(101);  
        s1.setS_name("Gaurav");  
        s1.setS_age(24);
        address.setId(1);
        address1.setId(2);
        address2.setId(3);
        address.setAid(s1.getS_id());
        address1.setAid(s1.getS_id());
        address2.setAid(s1.getS_id());
        address.setCity("kanpur");
        address.setCountry("India");
        address.setPincode("208005");
        address.getId();
        address1.setCity("mathura");
        address1.setCountry("India");
        address1.setPincode("281406");
        address1.getId();
        address2.setCity("agra");
        address2.setCountry("India");
        address2.setPincode("205002");
        address2.getId();
        
         
        
        
//        StudentEntity s2=new StudentEntity();  
//        Address address3=new Address();
//        Address address4=new Address();
//        Address address5=new Address();
//        List<Address> list1 = new ArrayList<>();
//        address3.setCity("kanpur");
//        address3.setCountry("India");
//        address3.setPincode("208005");
//        address4.setCity("mathura");
//        address4.setCountry("India");
//        address4.setPincode("281406");
//        address5.setCity("agra");
//        address5.setCountry("India");
//        address5.setPincode("205002");
//        list1.add(address3);
//        list1.add(address4);
//        list1.add(address5);
//        s2.setS_id(102);  
//        s2.setS_name("Ronit");  
//        s2.setS_age(22);  
//        s2.setAddress(list1);
//        
//        StudentEntity s3=new StudentEntity();  
//        Address address6=new Address();
//        Address address7=new Address();
//        Address address8=new Address();
//        List<Address> list2 = new ArrayList<>();
//        address6.setCity("kanpur");
//        address6.setCountry("India");
//        address6.setPincode("208005");
//        address7.setCity("mathura");
//        address7.setCountry("India");
//        address7.setPincode("281406");
//        address8.setCity("agra");
//        address8.setCountry("India");
//        address8.setPincode("205002");
//        list2.add(address6);
//        list2.add(address7);
//        list2.add(address8);
//        
//        s3.setS_id(103);  
//        s3.setS_name("Rahul");  
//        s3.setS_age(26);  
//        s3.setAddress(list2);  
          em.persist(s1);  
          em.persist(address);
          em.persist(address1);
          em.persist(address2);
       
          
//        em.persist(s2);  
//        em.persist(s3);       
//  
        em.getTransaction().commit();  
          
        emf.close();  
        em.close();  
          
    }  
}  