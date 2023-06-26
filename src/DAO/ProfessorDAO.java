package DAO;

import conexao.conexao;
import entity.Professor;
import java.sql.PreparedStatement;


public class ProfessorDAO {
  public void CadastrarProfessor(Professor professor) {
    String sql =
        "INSERT INTO professor (nome, cpf, email, fone, data_contratado, salario, formacao) VALUES (?, ?, ?, ?, ?, ?, ?)";

    PreparedStatement ps = null;

    try {
      ps = conexao.getConexao().prepareStatement(sql);

      ps.setString(1, professor.getNome());
      ps.setString(2, professor.getCpf());
      ps.setString(3, professor.getEmail());
      ps.setString(4, professor.getFone());
      ps.setDate(5, professor.getData_contratado());
      ps.setFloat(6, professor.getSalario());
      ps.setString(7, professor.getFormacao());

      ps.execute();
      ps.close();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
