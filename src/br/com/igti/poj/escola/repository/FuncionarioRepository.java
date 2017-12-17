package br.com.igti.poj.escola.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.igti.poj.escola.to.interfaces.IFuncionario;
import br.com.igti.poj.escola.to.pessoas.PessoaTO;


/**
 * Essa classe fica com a reponsabilidade de inserção no banco. Atende o Princípio SRP(Single Responsability Principle) do padrão SOLID, pois
 * evita que a classe Funcionario cuide da comunicação com banco
 *
 */


public class FuncionarioRepository {
  
  
  
  public void adicionarFuncionario(IFuncionario funcionario) throws SQLException
  {

	  Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dados?user=root&password=1234");  
	  
 	
 	 
 	String sql = "insert into agendamento(nome,cpf, rg) "
 	+ "values(?,?,?,?,?,?)";
 	 
 	 
 	PreparedStatement statement = (PreparedStatement) connection.prepareStatement(sql);
 	 
 	 
 	statement.setString(1, ((PessoaTO) funcionario).getNome());
 	statement.setString(2,((PessoaTO) funcionario).getDataNascimento().getTime().toString());
 	statement.executeQuery();
 	connection.close();
 	statement.close();
 }
   
  public static Connection conexao() throws SQLException {  
  Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/dados?user=root&password=1234");  
  return conn;  
  } 

}