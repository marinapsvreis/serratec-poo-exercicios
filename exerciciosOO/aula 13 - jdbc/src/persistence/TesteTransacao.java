package persistence;

import java.sql.Connection;
import java.sql.SQLException;

import model.Produto;

public class TesteTransacao {

	public static void main(String[] args) {
		Produto p1 = new Produto(null, "Tangerina", "Pokan", 9.0, 100);
		Produto p2 = new Produto(null, "Banana", "Prata", 5.0, 100);
		Produto p3 = new Produto(null, "Laranja", "Pera", 7.5, 100);
		Connection connection = ConnectionFactorySingleton.getConnection();
		
		try {
			
			connection.setAutoCommit(false);
			ProdutoDao pdao = new ProdutoDao(connection);
			pdao.inserir(p1);
			pdao.inserir(p2);
			pdao.inserir(p3);
			
			connection.commit();
		} catch (SQLException e) {
			 try {
	                connection.rollback();
	            } catch (SQLException e1) {
	                e1.printStackTrace();
	            }
	            e.printStackTrace();
	        }
		}
}
