package entited;

public class Empregados {
	private String nome;
	private Integer id;
	private Double salario;
	
 public Empregados(String nome, int id, double salario) {
	 this.nome = nome;
	 this.id = id;
	 this.salario = salario;
 }
 public String getNome () {
	 return nome;
 }
 public Integer getId()
 {
	 return id;
 }
 public void setSalario(int porcento) {
	 this.salario+=salario*porcento/100;
 }
 public Double getSalario() {
	 return salario;
 }
 public String toString () {
	 return id +","+nome+","+salario;
 }
}
