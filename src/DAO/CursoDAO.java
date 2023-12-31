package DAO;

import conexao.conexao;
import entity.Curso;
import java.sql.PreparedStatement;

public class CursoDAO {
  public void CadastrarCurso(Curso curso) {
    String sql =
        "INSERT INTO curso (nome, descricao, carga_horaria, preco) VALUES (?, ?, ?, ?)";

    PreparedStatement ps = null;

    try {
      ps = conexao.getConexao().prepareStatement(sql);

      ps.setString(1, curso.getNome());
      ps.setString(2, curso.getDescricao());
      ps.setInt(3, curso.getCaraHoraria());
      ps.setDouble(4, curso.getPreco());

      ps.execute();
      ps.close();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
