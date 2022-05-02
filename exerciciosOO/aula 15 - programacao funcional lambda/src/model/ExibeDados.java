package model;

import java.util.function.Consumer;

public class ExibeDados implements Consumer<Aluno> {

	@Override
	public void accept(Aluno t) {
		System.out.println(t);		
	}

}
