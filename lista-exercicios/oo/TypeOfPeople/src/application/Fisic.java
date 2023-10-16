package application;

public class Fisic extends Person {
	private double gastosComSaude;
	
	public Fisic() {
		
	}

	public Fisic(String name, double rendaAnual, double gastosComSaude) {
		super.name = name;
		super.rendaAnual = rendaAnual;
		this.gastosComSaude = gastosComSaude;
	}
	
	public double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public double impostos() {
		double i;
		if(rendaAnual<20000) {
			i = rendaAnual*(15.0/100.0);
		} else {
			i = rendaAnual*(25.0/100.0);
		}
		if(gastosComSaude != 0) {
			i = i - gastosComSaude*(50.0/100.0);
		}	
		return i;
	}

	@Override
	public String toString() {
		return name + ": "+
				"$ " + impostos();
	}
	
	
}
