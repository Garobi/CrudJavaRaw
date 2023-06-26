package DAO;

import java.sql.PreparedStatement;

import conexao.conexao;
import entity.Turma;

public class TurmaDAO {
    public void CadastrarTurma(Turma turma) {
        String sql = "INSERT INTO turma (cod, curso_idcurso, data_inicio) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, turma.getCod());
            ps.setInt(2, turma.getCursoIdCurso());
            ps.setDate(3, turma.getDataInicio());

            ps.execute();
            ps.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
