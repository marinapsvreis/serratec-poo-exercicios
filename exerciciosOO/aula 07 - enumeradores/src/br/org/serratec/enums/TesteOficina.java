package br.org.serratec.enums;

import java.time.LocalDate;

public class TesteOficina {

	public static void main(String[] args) {
		Proprietario p1 = new Proprietario("Douglas");
		
		Carro c1 = new Carro("KA", LocalDate.now(), new Proprietario("Marina"), "2 Portas");
		Carro c2 = new Carro("Clio", LocalDate.of(2022, 4, 16), p1, "4 Portas");
		Carro c3 = new Carro("Spin", LocalDate.of(2021, 8, 16), p1, "4 Portas");
		
		Moto m1 = new Moto("Lander", LocalDate.now(), p1, 250);
		Moto m2 = new Moto("Kawasaki", LocalDate.now(), p1, 500);
		Moto m3 = new Moto("Harley", LocalDate.now(), p1, 400);

		c3.addServico(c3.trocarOleo());
		c3.addServico(c3.revisao());
		c3.addServico(c3.lavarVeiculo());
		System.out.println(c3.toString() + "Descontos Aplicados: " + c3.getDescontosAplicados() + "\nServiços: " + c3.getServicosSelecionados() + String.format("\nTotal: R$ %.2f",  c3.getValorCobrado()));
	}

}
