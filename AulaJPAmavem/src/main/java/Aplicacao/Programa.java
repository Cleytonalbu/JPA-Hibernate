package Aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//Apagar pessoa no BD
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		//Buscando no banco de dados
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
		
		//Adicionando no banco de dados.
		
		//Pessoa p1 = new Pessoa(null,"Cleyton", "cleyton@gmail.com")
		//em.getTransaction().begin();
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		//em.getTransaction().commit();
		//System.out.println("Pronto!");
	
	}

}
