package application;

public abstract class Person {
	protected String name;
	protected double rendaAnual;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getRendaAnual() {
		return rendaAnual;
	}



	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}



	public abstract double impostos();
}
