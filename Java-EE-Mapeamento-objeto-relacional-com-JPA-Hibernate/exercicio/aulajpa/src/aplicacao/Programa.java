package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1 = new Pessoa (1,"Daniel", "daniel@gmail.com");
		Pessoa p2 = new Pessoa (2,"Hellen", "hellen@gmail.com");
		Pessoa p3 = new Pessoa (3,"Breno", "breno@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
