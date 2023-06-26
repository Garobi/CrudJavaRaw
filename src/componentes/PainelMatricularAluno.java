package componentes;
import DAO.MatriculasDAO;
import entity.Matriculas;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;

public class PainelMatricularAluno {
  Matriculas matriculas = new Matriculas();

  public JPanel iniciaComponentMatricula(Container Window) {
    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(0, 0, 800, 600);
    painel.setBorder(BorderFactory.createTitledBorder("Matricular Aluno"));

    JLabel idAlunoLabel = new JLabel("Id Aluno:");
    idAlunoLabel.setBounds(10, 25, 150, 25);
    idAlunoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(idAlunoLabel);

    JLabel idTurmaLabel = new JLabel("Id Turma:");
    idTurmaLabel.setBounds(10, 55, 150, 25);
    idTurmaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(idTurmaLabel);

    JLabel dataMatriculaLabel = new JLabel("Data Matricula:");
    dataMatriculaLabel.setBounds(10, 85, 150, 25);
    dataMatriculaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(dataMatriculaLabel);

    JTextField idAlunoTextField = new JTextField();
    idAlunoTextField.setBounds(170, 25, 150, 25);
    painel.add(idAlunoTextField);

    JTextField idTurmaTextField = new JTextField();
    idTurmaTextField.setBounds(170, 55, 150, 25);
    painel.add(idTurmaTextField);

    JSpinner dataMatriculaSpinner = new JSpinner(new SpinnerDateModel());
    DateEditor editor = new DateEditor(dataMatriculaSpinner, "dd.MM.yyyy");
    dataMatriculaSpinner.setEditor(editor);
    dataMatriculaSpinner.setBounds(170, 85, 150, 25);
    painel.add(dataMatriculaSpinner);

    JButton cadastrarButton = new JButton("Cadastrar");
    cadastrarButton.setBounds(10, 115, 320, 25);
    painel.add(cadastrarButton);
    cadastrarButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        java.util.Date dateConvert =
            (java.util.Date)dataMatriculaSpinner.getValue();
        java.sql.Date dataSqlConvert = new java.sql.Date(dateConvert.getTime());
        matriculas.setAlunoIdAluno(
            Integer.parseInt(idAlunoTextField.getText()));
        matriculas.setDataMatricula(dataSqlConvert);
        matriculas.setTurmaIdTurma(
            Integer.parseInt(idTurmaTextField.getText()));

        new MatriculasDAO().MatricularAluno(matriculas);
      }
    });

    JButton retornarButton = new JButton("Retornar");
    retornarButton.setBounds(10, 145, 320, 25);
    painel.add(retornarButton);
    retornarButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        FrameInicial frameInicial = new FrameInicial();
        Window.add(frameInicial.telaInicial(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });

    return painel;
  }
}
