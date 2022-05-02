package persistense;

import java.sql.Connection;

import model.Cliente;

public class TestarBuscar {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();

		ClienteDao cdao = new ClienteDao();

		System.out.println(cdao.buscar(4));
	}

}
