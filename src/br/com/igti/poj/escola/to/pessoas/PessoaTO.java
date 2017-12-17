package br.com.igti.poj.escola.to.pessoas;

import java.util.Calendar;

import br.com.igti.poj.escola.to.utils.EnderecoTO;


public abstract class PessoaTO {
	private String nome;
	private EnderecoTO endereco;
	private Calendar dataNascimento;;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EnderecoTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoTO endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
