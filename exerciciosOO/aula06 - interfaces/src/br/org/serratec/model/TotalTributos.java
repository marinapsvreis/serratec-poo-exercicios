package br.org.serratec.model;

public class TotalTributos {
	private double total;

	public void totalizarTributos(Tributos tributos) {
		total += tributos.calculaImpostoDeRenda();
		total += tributos.calcularICMS();
	}
	
	public double getTotal() {
			return total;
	}	
		
		
		//System.out.println(tributos.toString() + "\n"
		//		+ " ICMS: " + tributos.calcularICMS()
		//		+ " IR: " + tributos.calculaImpostoDeRenda());
	}
