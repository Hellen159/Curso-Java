package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa (null,"Daniel", "daniel@gmail.com");
		Pessoa p2 = new Pessoa (null,"Hellen", "hellen@gmail.com");
		Pessoa p3 = new Pessoa (null,"Breno", "breno@gmail.com");
		
		
		EntityManagerFactory efm = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = efm.createEntityManager();
		
		em.getTransaction().begin();
		
		//cadastro no banco de dados
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		
		// instanciando e encontrando pessoa no banco de dados
		//Pessoa p = em.find(Pessoa.class, 2);
		//System.out.println(p);
		
		//busco no banco de dados e removo
		Pessoa p = em.find(Pessoa.class, 1);
		em.remove(p);
		
		
		em.getTransaction().commit();

		System.out.println("PRONTO!");
		
		efm.close();
		em.close();

	}

}
