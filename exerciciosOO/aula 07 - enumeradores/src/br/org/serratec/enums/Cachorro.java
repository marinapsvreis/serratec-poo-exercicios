package br.org.serratec.enums;

import java.time.LocalDate;

public class Cachorro extends Mamifero implements AnimalDomestico {
	private boolean castrado;

	public Cachorro(String nome, LocalDate dataVacinacao, String raca, boolean castrado) {
		super(nome, dataVacinacao, raca);
		this.castrado = castrado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	@Override
	public boolean levarVeterinario() {
		System.out.println(getNome() + " est� sendo levado ao veterin�rio");
		return true;
	}

	@Override
	public boolean alimentar() {
		System.out.println(getNome() + " est� sendo alimentado!");
		return true;
	}

	@Override
	public void amamentar() {
		System.out.println(getNome() + " est� amamentando!");

	}

	@Override
	public String emitirSom() {
		return getNome() + " latiu!";
	}

}
