package br.com.igti.poj.escola;

import java.util.Arrays;
import java.util.List;

import br.com.igti.poj.escola.to.EscolaTO;
import br.com.igti.poj.escola.to.pessoas.AlunoTO;

public class EscolaCreator {
/** 
 * Matricula os alunos usando lambda
 * @param args
 */
	public static void main(String[] args) {
		
		EscolaTO escola= new EscolaTO();
		
		List<String> nomes = Arrays.asList("Lucas", "Rodrigo", "Alceu","Edgar","Leandro","José","George");
		// utiliza o lambda para cadastrar alunos
		nomes.forEach(nome -> escola.matricularAluno(new AlunoTO(nome)));
		
		nomes.forEach(nome -> System.out.println(nome));
	
		
	}

}
