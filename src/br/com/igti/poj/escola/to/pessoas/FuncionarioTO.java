package br.com.igti.poj.escola.to.pessoas;

import java.time.Instant;
import java.util.Date;

import br.com.igti.poj.escola.dao.EscolaDAO;
import br.com.igti.poj.escola.repository.interfaces.IfuncionarioRepository;
import br.com.igti.poj.escola.to.interfaces.IFuncionario;

public class FuncionarioTO extends PessoaTO implements IFuncionario{
	/**
	 * traz o nome disponível no cartão de funionário
	 */
	private String codigoFuncionario;
	private String cargo;
	
	IfuncionarioRepository funcioariorepository;
	
	public FuncionarioTO(IfuncionarioRepository funcioariorepository){
		
		this.funcioariorepository=funcioariorepository;
		
	}
	
	
	public void criarFunionario(){
		
		this.funcioariorepository.criarFuncionario(this);
		Instant inicio = Instant.now();
		
		
	}
	

	public String getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(String codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	@Override
	public Boolean registrarEntrada(Integer codFuncionario, Date dia) {
		if(codFuncionario != null && dia != null)
			return new EscolaDAO().registraEntrada(codFuncionario,dia);
		return false;
	}
	
	@Override
	public Boolean registrarSaida(Integer codFuncionario, Date dia) {
		if(codFuncionario != null && dia != null)
			return new EscolaDAO().registraSaida(codFuncionario,dia);
		return false;
	}
	
	@Override
	public void registrarAta(String descricao) {
		if(!descricao.trim().equals(""))
			new EscolaDAO().registraAta(descricao);
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	

}
