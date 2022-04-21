import java.util.ArrayList;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Marina", "marinapsvreis@gmail.com", 30);
		Pessoa p2 = new Pessoa("Douglas", "douglas@gmail.com", 30);
		Pessoa p3 = new Pessoa("Mateus", "mateus@gmail.com", 21);
		//Cliente c1 = new Cliente("Cliente 1");

		List<Pessoa> listaPessoas = new ArrayList<>();
		//List listaPessoas = new ArrayList<>();

		listaPessoas.add(p1);
		listaPessoas.add(p2);
		listaPessoas.add(p3);
		//listaPessoas.add(c1);

		// listaPessoas.addAll(listaPessoas);

		//for (Object pessoa : listaPessoas) {
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa);
		}
	}

}
