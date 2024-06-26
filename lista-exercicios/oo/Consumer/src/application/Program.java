package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		list.add(new Product("gabis", 2));
		list.add(new Product ("Felps", 20));
		list.add(new Product ("cr7", 200));
		
		Consumer<Product> cons = p -> p.setPrice(p.getPrice()*1.1);

		list.forEach(cons);
		list.forEach(System.out::println);
	}

}
