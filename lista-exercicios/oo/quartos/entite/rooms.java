package entite;

public class rooms {
	private String nome;
	private String email;
	
	public rooms (String nome, String email) {
		this.nome= nome;
		this.email=email;
	}
	public void getNome(String nome) {
		this.nome=nome;
	}
	public String setNome() {
		return nome;
	}
	public void getEmail(String email) {
		this.email=email;
	}
	public String setEmail() {
		return email;
	}

	public String toString() {
		return "nome:"+ nome+
				" email:"+email;	
		}
	
	

}
