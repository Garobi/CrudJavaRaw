package DAO;

import conexao.conexao;
import entity.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoDAO {
  public void CadastrarAluno(Aluno aluno) {
    String sql =
        "INSERT INTO Aluno (endereco_idendereco, nome, cpf, email, fone, data_nascimento) VALUES (?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = null;

    try {
      ps = conexao.getConexao().prepareStatement(sql);

      ps.setInt(1, aluno.getEndereco_idendereco());
      ps.setString(2, aluno.getNome());
      ps.setString(3, aluno.getCpf());
      ps.setString(4, aluno.getEmail());
      ps.setString(5, aluno.getFone());
      ps.setDate(6, aluno.getData_nascimento());

      ps.execute();
      ps.close();

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public void RemoverAluno(Aluno aluno) {
    String sql = "DELETE FROM Aluno WHERE idAluno = ?";

    PreparedStatement ps = null;

    try {
      ps = conexao.getConexao().prepareStatement(sql);

      ps.setInt(1, aluno.getIdAluno());

      ps.execute();
      ps.close();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }

  public void EditarAluno(Aluno aluno) {
    String sql =
        "UPDATE Aluno SET endereco_idendereco = ?, nome = ?, cpf = ?, email = ?, fone = ?, data_nascimento = ? WHERE idAluno = ?";

    PreparedStatement ps = null;

    try {
      ps = conexao.getConexao().prepareStatement(sql);

      ps.setInt(1, aluno.getEndereco_idendereco());
      ps.setString(2, aluno.getNome());
      ps.setString(3, aluno.getCpf());
      ps.setString(4, aluno.getEmail());
      ps.setString(5, aluno.getFone());
      ps.setDate(6, aluno.getData_nascimento());
      ps.setInt(7, aluno.getIdAluno());

      ps.execute();
      ps.close();

    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
