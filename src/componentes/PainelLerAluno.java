package componentes;

import DAO.AlunoDAO;
import conexao.conexao;
import entity.Aluno;
import java.awt.Container;
import java.awt.Dimension;
import java.net.IDN;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PainelLerAluno {
  Aluno aluno = new Aluno();

  public JPanel IniciaComponenteLerAluno(Container Window) {

    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(0, 0, 800, 600);
    painel.setBorder(BorderFactory.createTitledBorder("Ler Aluno"));

    String[] cabecalho = {"ID Aluno",   "CPF",  "Nome",
                          "E-Mail",     "Fone", "Data de Nascimento",
                          "ID Endereço"};

    final DefaultTableModel modelo = new DefaultTableModel();
    JTable table = new JTable(modelo);

    modelo.addColumn("ID Aluno");
    modelo.addColumn("CPF");
    modelo.addColumn("Nome");
    modelo.addColumn("E-Mail");
    modelo.addColumn("Fone");
    modelo.addColumn("Data de Nascimento");
    modelo.addColumn("ID Endereço");

    try {
      Statement st = conexao.getConexao().createStatement();
      ResultSet rs = st.executeQuery("SELECT * FROM Aluno");

      while (rs.next()) {
        int id = rs.getInt("idAluno");
        String cpf = rs.getString("cpf");
        String nome = rs.getString("nome");
        String email = rs.getString("email");
        String fone = rs.getString("fone");
        String nascimento = rs.getString("data_nascimento");
        int endereco = rs.getInt("endereco_idendereco");
        modelo.addRow(new Object[] {new Integer(id), cpf, nome, email, fone,
                                    nascimento, new Integer(endereco)});
      }
    } catch (Exception e) {
      // TODO: handle exception
    }

    table.setPreferredScrollableViewportSize(new Dimension(800, 1020));
    JScrollPane scrollPane = new JScrollPane(table);

    table.setBounds(20, 20, 600, 600);

    painel.add(table);

    return painel;
  }
}
