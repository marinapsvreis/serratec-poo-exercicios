
public class TesteTime {

	public static void main(String[] args) {
		Time t1 = new Time("Time Impar", "Tecnico 1", "Diretor 1");
		Time t2 = new Time("Time Par", "Tecnico 2", "Diretor 2");
		
		Atleta a1 = new Atleta("Atleta 1", 30, "atacante");
		Atleta a2 = new Atleta("Atleta 2", 29, "zagueiro");
		Atleta a3 = new Atleta("Atleta 3", 28, "goleiro");
		Atleta a4 = new Atleta("Atleta 4", 27, "lateral");
		Atleta a5 = new Atleta("Atleta 5", 26, "meio-campo");
		Atleta a6 = new Atleta("Atleta 6", 25, "zagueiro");
		
		t1.addAtleta(a1);
		t1.addAtleta(a3);
		t1.addAtleta(a5);
		t2.addAtleta(a2);
		t2.addAtleta(a4);
		t2.addAtleta(a6);
		
		System.out.println();
		
		System.out.println("O time do " + a1 + " é o" + a1.getTime());
		System.out.println("O time do " + a2 + " é o" + a2.getTime());
		
		System.out.println();
		
		System.out.println("Time 1, lista de atletas:");
		t1.mostrarAtletas();
		
		System.out.println();
		
		System.out.println("Time 2, lista de atletas:");
		t2.mostrarAtletas();
		

	}

}
