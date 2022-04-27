package br.serratec.model;

public class TesteSorteio {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Marina", "Desenvolvedor Junior", "TI");
		Funcionario f2 = new Funcionario("Enaide", "Analista", "RH");
		Funcionario f3 = new Funcionario("Douglas", "Segurança", "Administração");
		
		Sorteio<Funcionario> s1 = new Sorteio();
		s1.adicionar(f1);
		s1.adicionar(f2);
		s1.adicionar(f3);
		
		Funcionario resultado = s1.sortear();
		System.out.println(resultado);
		
		Sorteio<Integer> sortearNumeros = new Sorteio<>();
		for(int i = 1; i <= 100; i++) {
			sortearNumeros.adicionar(i);
		}
		int resultadoNum = sortearNumeros.sortear();
		System.out.println(resultadoNum);		

	}

}
