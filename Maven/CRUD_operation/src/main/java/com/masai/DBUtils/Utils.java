package com.masai.DBUtils;

import com.masai.model.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Utils {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("studentUnit");
		
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 20);
		
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("Student doesn't exists");
		}
		
		em.close();
		
	}
	
}
