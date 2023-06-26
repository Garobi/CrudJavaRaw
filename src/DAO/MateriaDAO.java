package DAO;

import java.sql.PreparedStatement;

import conexao.conexao;
import entity.Materia;

public class MateriaDAO {
    public void CadastrarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nome, descricao, carga_horaria) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setString(1, materia.getNome());
            ps.setString(2, materia.getDescricao());
            ps.setInt(3, materia.getCargaHoraria());

            ps.execute();
            ps.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
