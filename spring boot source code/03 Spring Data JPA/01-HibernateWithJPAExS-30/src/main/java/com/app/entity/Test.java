package com.app.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	
	public static void main(String[] args) {
		
		EntityTransaction tx=null;
		
		try {
			

			EntityManagerFactory emf = Persistence.createEntityManagerFactory("AppDB");
			System.out.println(emf.getClass().getName());
			
			EntityManager em = emf.createEntityManager();
			System.out.println(em.getClass().getName());
			
			 tx = em.getTransaction();
			 System.out.println(tx.getClass().getName());
			 
			 tx.begin();
			 
			 Employee emp = new Employee();
			 
			 emp.setEmpId(10);
			 emp.setEmpName("Madhav");
			 emp.setEmpSal(35000.0);

			 em.persist(emp);
			 
			 tx.commit();
			 
			 emf.close();
			
		} catch (Exception e) {
			
			if(tx!=null) {
				tx.rollback();
			}
			
			e.printStackTrace();
		}
		
		
		
		
	}

}
