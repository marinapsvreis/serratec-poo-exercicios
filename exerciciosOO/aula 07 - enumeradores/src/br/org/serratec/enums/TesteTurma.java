package br.org.serratec.enums;

public class TesteTurma {

	public static void main(String[] args) {
		Turma t1 = new Turma(1, "Tecnologia da Informa��o", PeriodoCurso.NOTURNO);
		Turma t2 = new Turma(2, "Administra��o", PeriodoCurso.INTEGRAL);
		Turma t3 = new Turma(3, "Marketing", PeriodoCurso.MANHA);
		
		System.out.println(t1);
		System.out.printf("%s - Carga hor�ria: %d \n", t2, t2.getPeriodo().getCargaHoraria());
		System.out.printf("%s - Dias da semana: %s \n", t3, t3.getPeriodo().getDiasDaSemana());

	}

}
