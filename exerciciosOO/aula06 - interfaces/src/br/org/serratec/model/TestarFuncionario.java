package br.org.serratec.model;

import java.util.ArrayList;
import java.util.List;

public class TestarFuncionario {

	public static void main(String[] args) {

		List<Funcionario> listaFuncionarios = new ArrayList<>();

		Administrativo a1 = new Administrativo("Marina", 22);
		listaFuncionarios.add(a1);
		Vendedor v1 = new Vendedor("Mateus", 10);
		listaFuncionarios.add(v1);

		v1.adicionarVenda(1000.00);
		v1.adicionarVenda(1000.00);
		v1.adicionarVenda(1000.00);
		v1.adicionarVenda(1000.00);
		v1.adicionarVenda(1000.00);

		a1.calcularSalario();
		v1.calcularSalario();

		System.out.println(a1);
		System.out.println();
		System.out.println(v1);

	}

}
