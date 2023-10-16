package application;

public class Juridic extends Person {
	
	private int numeroFuncionarios;
	
	public Juridic() {
		
	}
	
	public Juridic(String name, double rendaAnual, int numeroFuncionarios) {
		super.name = name;
		super.rendaAnual = rendaAnual;
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double impostos() {
		double i ;
		if(numeroFuncionarios<10) {
			i = rendaAnual * 16/100;
		}else {
			i = rendaAnual*14/100;
		}
		
		return i;
	}
	@Override
	public String toString() {
		return name + ": "+
				"$ " + impostos();
	}
}
