package br.serratec.model.data;

import java.util.Calendar;

public class TesteCalendar {

	public static void main(String[] args) {
		Calendar dataDeHoje = Calendar.getInstance();
		System.out.println(dataDeHoje);
		int ano = dataDeHoje.get(Calendar.YEAR);
		System.out.println(ano);

	}

}
