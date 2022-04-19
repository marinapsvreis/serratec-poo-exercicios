package br.org.serratec.enums;

import java.time.LocalDate;

public class Carro extends Veiculo implements Oficina {
	private String categoria;	

	public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return super.toString() + "Carro " + categoria + "\n";
	}

	@Override
	public double lavarVeiculo() {
		setServicosSelecionados(getServicosSelecionados() + TipoServico.LAVAGEM.getDescricao() +"("+ TipoServico.LAVAGEM.getValorPorServico()  +")"+" | ");
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		setServicosSelecionados(getServicosSelecionados() + TipoServico.OLEO.getDescricao() + "("+ TipoServico.OLEO.getValorPorServico()  +")"+" | ");
		if(getDataConserto().getDayOfWeek().name().equals("SATURDAY")) {
			setDescontosAplicados(getDescontosAplicados() + "Desconto de R$ 50,00 (Troca de Óleo aos Sábados) | ");
			return TipoServico.OLEO.getValorPorServico() - 50.00;
		}else {
			return TipoServico.OLEO.getValorPorServico();
		}
		
	}

	@Override
	public double revisao() {
		setServicosSelecionados(getServicosSelecionados() + TipoServico.REVISAO.getDescricao() + "("+ TipoServico.REVISAO.getValorPorServico()  +")"+" | ");
		if(getDataConserto().getMonth().name().equals("AUGUST")) {
			setDescontosAplicados(getDescontosAplicados() + "Desconto de 10% (No valor da revisão no mês de Agosto) | ");
			return TipoServico.REVISAO.getValorPorServico() * 0.9;
		}else {
			return TipoServico.REVISAO.getValorPorServico();
		}
		
	}

}
