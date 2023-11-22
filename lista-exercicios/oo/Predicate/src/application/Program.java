package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Product> list = new ArrayList <> ();
		list.add(new Product ("tv", 1000));
		list.add(new Product ("mouse", 80));
		list.add(new Product ("monitor", 500));
		
		list.removeIf(new ProductPredicate());
		for (Product p : list) {
			System.out.println(p);
		}
	}

}
