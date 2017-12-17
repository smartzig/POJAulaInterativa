package br.com.igti.poj.escola.to.pessoas;

import java.util.Date;

import br.com.igti.poj.escola.to.interfaces.IAluno;

public class AlunoTO extends PessoaTO implements IAluno{

	
	public AlunoTO(String nome) {
		setNome(nome);
	}
	private Integer numeroChamada;
	
	public Integer getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(Integer numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	@Override
	public void responderChamada(Date dia) {
		// TODO Auto-generated method stub
		
	}

}
