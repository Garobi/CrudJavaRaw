package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.conexao;
import entity.Aluno;

public class AlunoDAO {
    public void CadastrarAluno(Aluno aluno) {
        String sql = "INSERT INTO Aluno (endereco_idendereco, nome, cpf, email, fone, data_nascimento, idAluno) VALUES (?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement ps = null;
        
        try {
            ps = conexao.getConexao().prepareStatement(sql);

            ps.setInt(1, aluno.getEndereco_idendereco());
            ps.setString(2, aluno.getNome());
            ps.setString(3, aluno.getCpf());
            ps.setString(4, aluno.getEmail());
            ps.setString(5, aluno.getFone());
            ps.setDate(6, aluno.getData_nascimento());
            ps.setInt(7, 2);

            ps.execute();
            ps.close();


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
