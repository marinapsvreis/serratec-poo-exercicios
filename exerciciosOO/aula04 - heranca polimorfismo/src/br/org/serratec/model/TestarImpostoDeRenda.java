package br.org.serratec.model;

public class TestarImpostoDeRenda {

	public static void main(String[] args) {
		ImpostoDeRenda pf = new PessoaFisica("Marina", "+5524999407781", "marinapsvreis@gmail.com", 50000.00, "12345678", "542315678");
		ImpostoDeRenda pj = new PessoaJuridica("ExemploNome", "+5524123456789", "exemplo@gmail.com", 25000.00, "87654321", "123456789");
		
		System.out.println(pf.getNome());
		System.out.println("Imposto a pagar: " + pf.calculoIR());
		System.out.println(pj.getNome());
		System.out.println("Imposto a pagar: " + pj.calculoIR());

	}

}
