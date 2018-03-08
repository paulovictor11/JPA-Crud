package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario(null, "Func1", "func1@gmail.com");
		Funcionario f2 = new Funcionario(null, "Func2", "func2@gmail.com");
		Funcionario f3 = new Funcionario(null, "Func3", "func3@gmail.com");
		
//		System.out.println(f1);
//		System.out.println(f2);
//		System.out.println(f3);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(f1);
		em.persist(f2);
		em.persist(f3);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		System.out.println("OK");
	}

}
