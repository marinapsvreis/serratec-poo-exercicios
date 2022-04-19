package br.org.serratec.enums;

import java.time.LocalDate;

public class Cavalo extends Mamifero implements AnimalCompeticao {
	private String marcaFerradura;

	public Cavalo(String nome, LocalDate dataVacinacao, String raca, String marcaFerradura) {
		super(nome, dataVacinacao, raca);
		this.marcaFerradura = marcaFerradura;
	}

	public String getMarcaFerradura() {
		return marcaFerradura;
	}

	@Override
	public void amamentar() {
		System.out.println(getNome() + " está amamentando!");
	}

	@Override
	public String emitirSom() {
		return getNome() + " está relinchando!";
	}

	@Override
	public void trocarFerradura() {
		System.out.println(getNome() + " está trocando a ferradura da marca " + marcaFerradura + "!");

	}

	@Override
	public void viajar() {
		System.out.println(getNome() + " está viajando!");

	}

}
