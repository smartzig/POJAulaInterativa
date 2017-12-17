package br.com.igti.poj.escola.to.pessoas;

import java.util.Date;

import br.com.igti.poj.escola.repository.interfaces.IfuncionarioRepository;
import br.com.igti.poj.escola.to.interfaces.IProfessor;

public class ProfessorTO extends FuncionarioTO implements IProfessor{

	public ProfessorTO(IfuncionarioRepository funcioariorepository) {
		super(funcioariorepository);
		// TODO Auto-generated constructor stub
	}

	private Integer codProfessor;

	public Integer getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(Integer codProfessor) {
		this.codProfessor = codProfessor;
	}

	@Override
	public void desenvolverPlanejamento(String descricao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desenvolverAula(Date dia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void realizarChamada(Date dia) {
		// TODO Auto-generated method stub
		
	}
	

}
