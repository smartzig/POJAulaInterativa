package br.com.igti.poj.escola.to.interfaces;

import java.util.Date;

public interface IProfessor {

	/**
	 * Recebe o planejamento descrito, para enviar para um DAO e persistir o planejamento do dia
	 * @param descricao
	 */
	public void desenvolverPlanejamento(String descricao);
	
	/**
	 *Recebe a data do dia da aula ministrada, e aplica o desenvolvimento da Aula. 
	 * @param dia
	 */
	public void desenvolverAula(Date dia);
	
	/**
	 * Recebe o dia da chamada e insere o nome dos alunos presentes
	 * @param dia
	 */
	public void realizarChamada(Date dia);
}
