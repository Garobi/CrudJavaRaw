package DAO;

import conexao.conexao;
import entity.Matriculas;
import java.sql.PreparedStatement;

public class MatriculasDAO {
  public void MatricularAluno(Matriculas matriculas) {
    String sql =
        "INSERT INTO matriculas (data_matricula, Aluno_idAluno, turma_idturma) VALUES (?, ?, ?)";
    PreparedStatement ps = null;

    try {
      ps = conexao.getConexao().prepareStatement(sql);

      ps.setDate(1, matriculas.getDataMatricula());
      ps.setInt(2, matriculas.getAlunoIdAluno());
      ps.setInt(3, matriculas.getTurmaIdTurma());

      ps.execute();
      ps.close();
    } catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }
  }
}
