package br.serratec.model.data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalUnit;

public class TesteLocalDate {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		System.out.println(LocalDate.of(2022, 04, 22));
		System.out.println(LocalDate.parse("2020-04-22"));
		
		System.out.println(hoje.plusDays(10));
		System.out.println(Period.between(LocalDate.of(1992, 04, 26), hoje));
		System.out.println(hoje.getDayOfMonth());
		

	}

}
