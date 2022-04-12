package org.serratec.model;

public class TesteMedico {

	public static void main(String[] args) {
		
		Medico m1 = new Medico("12345", "Ana Maria", 0.0, 250.00);
		Medico m2 = new Medico("456789", "Antônio", 0.0, 300.00);
		
		m1.pagamentoDinheiro();
		m2.pagamentoPlano();
		
		System.out.printf("CRM: %s%nNome: %s%nSalario: R$ %.2f%nValor Consulta: R$ %.2f%n%n", 
				m1.getCrm(), m1.getNome(), m1.getSalario(), m1.getValorConsulta());
		
		System.out.printf("CRM: %s%nNome: %s%nSalario: R$ %.2f%nValor Consulta: R$ %.2f%n%n", 
				m2.getCrm(), m2.getNome(), m2.getSalario(), m2.getValorConsulta());
		
		System.out.println("Quantidade de médicos cadastrados: " + Medico.getContador());
		
	}

}
