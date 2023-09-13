package entities;

public class Account {
	
	private Integer numero;
	private String holder;
	protected Double balance;
	
	public Account () {
		
		
	}
	
	public Account(Integer numero, String holder, Double balance) {
		this.numero = numero;
		this.holder = holder;
		this.balance = balance;
		
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public void withdraw(double amount) {
		balance-=amount +5.0;
	}
	public void deposit(double amount) {
		balance += amount;
	}
	
	

}
