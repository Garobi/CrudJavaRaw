package DAO;

import conexao.conexao;
import entity.Aluno;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
