package br.org.serratec.enums;

import java.time.LocalDate;

public class Moto extends Veiculo implements Oficina{
	private int cilindradas;

	public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario,
			int cilindradas) {
		super(modelo, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public double lavarVeiculo() {
		setServicosSelecionados(getServicosSelecionados() + "("+ TipoServico.LAVAGEM.getValorPorServico()  +")"+" | ");
		return TipoServico.LAVAGEM.getValorPorServico();
	}

	@Override
	public double trocarOleo() {
		setServicosSelecionados(getServicosSelecionados() + "("+ TipoServico.OLEO.getValorPorServico()  +")"+" | ");
		return TipoServico.OLEO.getValorPorServico();
	}

	@Override
	public double revisao() {
		setServicosSelecionados(getServicosSelecionados() + "("+ TipoServico.REVISAO.getValorPorServico()  +")"+" | ");
		return TipoServico.REVISAO.getValorPorServico();
	}
	
	
	
	
	
	
}
