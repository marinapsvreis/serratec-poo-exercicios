package persistense;

import java.sql.Connection;

import model.Cliente;

public class TestarInsert {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();
		
		ClienteDao cdao = new ClienteDao();
		
		Cliente c1 = new Cliente(null, "Breno", "22324321", "breno@gmail.com");
		Cliente c2 = new Cliente(null, "Marina", "22324322", "marina@gmail.com");
		Cliente c3 = new Cliente(null, "Mateus", "22324323", "mateus@gmail.com");
		
		//cdao.inserir(c1);
		//cdao.inserir(c2);
		//cdao.inserir(c3);
	}

}
