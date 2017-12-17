package br.com.igti.poj.escola.to;

import java.util.ArrayList;
import java.util.List;

import br.com.igti.poj.escola.dao.EscolaDAO;
import br.com.igti.poj.escola.to.interfaces.IEscola;
import br.com.igti.poj.escola.to.pessoas.AlunoTO;
import br.com.igti.poj.escola.to.pessoas.FuncionarioTO;
import br.com.igti.poj.escola.to.pessoas.ProfessorTO;


/**
 *  Os metodos implementados de IEscola, utilizaram o conceito de Extração de método. (Refatoração)
 */

public class EscolaTO implements IEscola{
	private List<FuncionarioTO> listFuncionarios;
	private List<AlunoTO> listaAlunos;

	public EscolaTO(){
		this.listFuncionarios = new ArrayList<FuncionarioTO>();
		this.listaAlunos = new ArrayList<AlunoTO>();
	}
	
	@Override
	public void contratarFuncionario(FuncionarioTO funcionario){
		if(tratarFuncionarioVO(funcionario)){
			new EscolaDAO().contratarFuncionario(funcionario);
		}
	}

	private boolean tratarFuncionarioVO(FuncionarioTO funcionario){
		if(funcionario != null){
			if(funcionario.getCargo() != null && funcionario.getEndereco() != null && funcionario.getNome() != null)
				return true;
		}		
		return false;		
	}
	
	@Override
	public void contratarProfessor(ProfessorTO professor){
		if(tratarProfessorVO(professor)){
			new EscolaDAO().contratarProfessor(professor);
		}
	}

	private boolean tratarProfessorVO(ProfessorTO professor){
		if(professor != null){
			if(professor.getEndereco() != null && professor.getNome() != null)
				return true;
		}		
		return false;		
	}

	@Override
	public void matricularAluno(AlunoTO aluno){
		if(tratarAlunoVO(aluno)){
			new EscolaDAO().matricularAluno(aluno);
		}
	}

	private boolean tratarAlunoVO(AlunoTO aluno){
		if(aluno != null){
			if(aluno.getEndereco() != null && aluno.getNome() != null)
				return true;
		}		
		return false;		
	}


	public List<FuncionarioTO> getListFuncionarios() {
		return listFuncionarios;
	}
	public void setListFuncionarios(List<FuncionarioTO> listFuncionarios) {
		this.listFuncionarios = listFuncionarios;
	}
	public List<AlunoTO> getListaAlunos() {
		return listaAlunos;
	}
	public void setListaAlunos(List<AlunoTO> listaAlunos) {
		this.listaAlunos = listaAlunos;
	}

}
