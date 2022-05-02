package persistence;

import java.sql.Connection;

public class TestarConexao {

	public static void main(String[] args) {
		Connection connection = ConnectionFactorySingleton.getConnection();
		Connection connection2 = ConnectionFactorySingleton.getConnection();
		System.out.println(connection);
		System.out.println(connection2);

	}
	
	//roda primeiro
//	static {
//		System.out.println("Bloco de inicialização estático");
//	}

}
