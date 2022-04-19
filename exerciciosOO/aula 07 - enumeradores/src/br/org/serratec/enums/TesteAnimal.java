package br.org.serratec.enums;

import java.time.LocalDate;

public class TesteAnimal {

	public static void main(String[] args) {
		Tucano t1 = new Tucano("Dibraldinho", LocalDate.now(), "Preto", 5.8);
		Cavalo c1 = new Cavalo("Bala no Alvo", LocalDate.of(2022, 04, 15), "Puro", "Alta Qualidade");
		Cachorro d1 = new Cachorro("Lorah", LocalDate.of(2021, 02, 01), "Dalmata", true);
		
		System.out.println(t1.emitirSom());
		System.out.println(c1.emitirSom());
		System.out.println(d1.emitirSom());
		
		System.out.println();
		
		System.out.println(t1.voar());
		c1.amamentar();
		d1.amamentar();
		
		System.out.println();
		
		c1.trocarFerradura();
		c1.viajar();
		
		System.out.println();
		
		d1.levarVeterinario();
		d1.alimentar();
		

	}

}
