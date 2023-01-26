package entidade;

public  class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double calcular (double price, int quant) {
		return price*quant+(IOF*quant*price);
	}

}
