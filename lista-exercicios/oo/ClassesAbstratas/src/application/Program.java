package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circulo = new Circle( Color.BLACK, 3.0);
		Shape retangulo = new Rectangle(Color.BLUE, 4, 3);
		System.out.println(circulo.toString());
		System.out.println(retangulo.toString());
	}

}
