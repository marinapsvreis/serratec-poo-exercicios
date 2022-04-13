package br.org.serratec.model;

public class TestarFuncionario2 {

	public static void main(String[] args) {
		Funcionario2 f1 = new Gerente2("Marina", 2000.00, "manhã", "TI");
		Funcionario2 f2 = new Assistente2("TesteAssistente", 1000.00, "tarde", 250.00);
		Funcionario2 f3 = new Funcionario2("TesteFuncionario", 1500.00, "noite");

		f1.aumentarSalario();
		f2.aumentarSalario();
		f3.aumentarSalario();

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

	}

}
