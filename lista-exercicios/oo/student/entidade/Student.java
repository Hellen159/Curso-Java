package entidade;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double grade() {
		return (nota1+nota2+nota3);
	}
	public double missing () {
		return 60.00 - this.grade();
	}
	public String toString() {
		return "Final grade :"+ String.format("%.2f",grade());
	}
}
