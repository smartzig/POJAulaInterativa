package br.com.igti.poj.escola.to.interfaces;

import java.util.Date;

public interface IFuncionario {

	/**
	 * Recebe o c�digo do funcion�rio e a data, persiste o dia e a hora da entrada do funcion�rio de manh� e ap�s o almo�o
	 * @param codFuncionario
	 * @return
	 */
	public Boolean registrarEntrada(Integer codFuncionario, Date dia);
	
	/**
	 * Recebe o c�digo do funcion�rio e a data, persiste o dia e a hora da entrada do funcion�rio Sa�da almo�o e final de tarde
	 * @param codFuncionario
	 * @return
	 */
	public Boolean registrarSaida(Integer codFuncionario, Date dia);
	
	/**
	 * Recebe a descri��o e a data de uma reuni�o para registro da ata no banco
	 */
	public void registrarAta(String descricao);
}