package model;

import java.io.Serializable;
import java.util.Objects;

/**
 * 
 * @author Marina
 * @version 1.0
 * @since criada em 29/04/2022
 *
 */

public class Fornecedor implements Serializable {

	/**
	 * Cadastro Único das empresas junto a receita federal
	 */
	private String cnpj;
	private String nome;
	private String email;
	
	/**
	 * Construtor de todos os atributos do fornecedor
	 * @param cnpj
	 * cnpj
	 * @param nome
	 * nome
	 * @param email
	 * email
	 */

	public Fornecedor(String cnpj, String nome, String email) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
	}
	
	/**
	 * @return Retorna o CNPJ do fornecedor
	 */

	public String getCnpj() {
		return cnpj;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return cnpj + " - " + nome + " - " + email + "\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cnpj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(cnpj, other.cnpj);
	}
	
	/**
	 * Método criado para calcular pagamento dos fornecedores.
	 * A fórmula de calculo deverão ser acrescida a comissão.
	 * @author Marina
	 * @since 29/04/2022
	 * @param valor recebe o valor de entrada do pagamento
	 * valor
	 * @return retorna o valor do cálculo do pagamento
	 * @throws IllegalArgumentException caso o valor for negativo lancar uma excessao.
	 */
	public Double calcularPagamento(Double valor) throws IllegalArgumentException {
		return 0.0;
	}
	
	/**
	 * Este Método imprime uma listagem de todos os fornecedores.
	 * @author Admin
	 * @since 29/04/2022
	 */
	
	public void listarFornecedores() {
		
	}

}
