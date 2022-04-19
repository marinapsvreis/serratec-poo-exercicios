package br.org.serratec.enums;

import br.org.serratec.enums.Pessoa.Escolaridade;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marina", "marinapsvreis@gmail.com", Setor.TI, EstadoCivil.SOLTEIRO, Escolaridade.GRADUACAO);
		
		System.out.println(p1);
		System.out.println(p1.getSetor().valueOf("COMPRAS"));
		System.out.println(p1.getSetor().ordinal());
		
		System.out.println();
		
		for(Setor setor : Setor.values()) {
			System.out.println(setor);
		}
		
		System.out.println();
		
		for(EstadoCivil estadoCivil : EstadoCivil.values()) {
			System.out.println(estadoCivil);
		}
		
		System.out.println();
		
		for(Escolaridade escolaridade : Escolaridade.values()) {
			System.out.println(escolaridade);
		}

	}

}
