package br.com.igti.poj.escola.to.interfaces;

import br.com.igti.poj.escola.to.pessoas.AlunoTO;
import br.com.igti.poj.escola.to.pessoas.FuncionarioTO;
import br.com.igti.poj.escola.to.pessoas.ProfessorTO;

public interface IEscola {
	public void contratarFuncionario(FuncionarioTO funcionario);
	public void contratarProfessor(ProfessorTO professor);
	public void matricularAluno(AlunoTO aluno);

}
