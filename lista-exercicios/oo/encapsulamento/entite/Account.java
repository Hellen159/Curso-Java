package entite;

public class Account {
// olhar o diagrama uml
	public String nome;
	public int numConta;
	public double total;

	//construtor para duas entradas
	public Account(String nome, int numConta) {
		this.nome = nome;
		this.numConta = numConta;

	}

	//construtor para tres entradas
	public Account(String nome, int numConta, double deposito) {
		this.nome = nome;
		this.numConta = numConta;
		iDeposito(deposito);
	}
//mostra o numero da conta mas nao deica alterar
	public int getNumConta() {
		return numConta;
	}

	//mostra o total da conta
	public double getTotal() {
		return total;
	}

	//mostra o nome da pessoa
	public String getNome() {
		return nome;
	}

	//pode alterar o nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	//faz a operação de deposito
	public void iDeposito(double deposito) {
		 total += deposito;
	}
	//faz o saque mais a taxa
	public void saque (double deposito) {
		 total -= deposito + 5;
	}
	//imprime quando chama a classe
	public String toString() {
		return "Account data: "
				+ numConta
				+ ", Holder: "
				+ nome
				+ ", Balance: $ "
				+ String.format("%.2f", total);
	}

}
