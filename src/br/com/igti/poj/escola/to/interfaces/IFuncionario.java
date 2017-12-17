package br.com.igti.poj.escola.to.interfaces;

import java.util.Date;

public interface IFuncionario {

	/**
	 * Recebe o código do funcionário e a data, persiste o dia e a hora da entrada do funcionário de manhã e após o almoço
	 * @param codFuncionario
	 * @return
	 */
	public Boolean registrarEntrada(Integer codFuncionario, Date dia);
	
	/**
	 * Recebe o código do funcionário e a data, persiste o dia e a hora da entrada do funcionário Saída almoço e final de tarde
	 * @param codFuncionario
	 * @return
	 */
	public Boolean registrarSaida(Integer codFuncionario, Date dia);
	
	/**
	 * Recebe a descrição e a data de uma reunião para registro da ata no banco
	 */
	public void registrarAta(String descricao);
}