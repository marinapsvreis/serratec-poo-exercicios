package org.serratec.model;

public class TestarPlano {

	public static void main(String[] args) {
		Clinica clinica = new Clinica("Sul America", "Checkup", "123456789");
		Medico medico = new Medico("Golden Cross", "123654", "Ana Luiza");
		Anestesista anestesista = new Anestesista("Amil", "123432", "Carlos", "Geral");
		ControlePagamento cp = new ControlePagamento();

		clinica.calcularPagamento();
		medico.calcularPagamento();
		anestesista.calcularPagamento();

		cp.calcularTotalPago(clinica);
		cp.calcularTotalPago(medico);
		cp.calcularTotalPago(anestesista);

		System.out.println(clinica);
		System.out.println(medico);
		System.out.println(anestesista);

		System.out.println(String.format("Total pago: %.2f", cp.getTotalPago()));
	}

}
