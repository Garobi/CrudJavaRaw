package componentes;
import DAO.AlunoDAO;
import entity.Aluno;
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

public class PainelEditarAluno {

  Aluno aluno = new Aluno();

  public JPanel iniciaComponentAluno(Container Window) {
    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(0, 0, 800, 600);
    painel.setBorder(BorderFactory.createTitledBorder("Editar Aluno"));

    JLabel nomeLabel = new JLabel("Nome: ");
    nomeLabel.setBounds(10, 25, 150, 25);
    nomeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(nomeLabel);

    JLabel cpfLabel = new JLabel("CPF:");
    cpfLabel.setBounds(10, 55, 150, 25);
    cpfLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(cpfLabel);

    JLabel emailLabel = new JLabel("email:");
    emailLabel.setBounds(10, 85, 150, 25);
    emailLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(emailLabel);

    JLabel foneLabel = new JLabel("Fone:");
    foneLabel.setBounds(10, 115, 150, 25);
    foneLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(foneLabel);

    JLabel dataNascimentoLabel = new JLabel("Data de Nascimento:");
    dataNascimentoLabel.setBounds(10, 145, 150, 25);
    dataNascimentoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(dataNascimentoLabel);

    JLabel enderecoLabel = new JLabel("endereco:");
    enderecoLabel.setBounds(10, 175, 150, 25);
    enderecoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(enderecoLabel);

    JLabel idAlunoLabel = new JLabel("ID Aluno:");
    idAlunoLabel.setBounds(10, 205, 150, 25);
    idAlunoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(idAlunoLabel);

    JTextField nomeTextField = new JTextField();
    nomeTextField.setBounds(170, 25, 150, 25);
    painel.add(nomeTextField);

    JTextField cpfTextField = new JTextField();
    cpfTextField.setBounds(170, 55, 150, 25);
    painel.add(cpfTextField);

    JTextField emailTextField = new JTextField();
    emailTextField.setBounds(170, 85, 150, 25);
    painel.add(emailTextField);

    JTextField foneTextField = new JTextField();
    foneTextField.setBounds(170, 115, 150, 25);
    painel.add(foneTextField);

    JSpinner dataNascimentSpinner = new JSpinner(new SpinnerDateModel());
    DateEditor editor = new DateEditor(dataNascimentSpinner, "dd.MM.yyyy");
    dataNascimentSpinner.setEditor(editor);
    dataNascimentSpinner.setBounds(170, 145, 150, 25);
    painel.add(dataNascimentSpinner);

    JTextField enderecoTextField = new JTextField();
    enderecoTextField.setBounds(170, 175, 150, 25);
    painel.add(enderecoTextField);

    JTextField idAluoTextField = new JTextField();
    idAluoTextField.setBounds(170, 205, 150, 25);
    painel.add(idAluoTextField);

    JButton cadastrarButton = new JButton("Editar");
    cadastrarButton.setBounds(10, 235, 320, 25);
    painel.add(cadastrarButton);
    cadastrarButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        java.util.Date dateConvert =
            (java.util.Date)dataNascimentSpinner.getValue();
        java.sql.Date dataSqlConvert = new java.sql.Date(dateConvert.getTime());
        aluno.setCpf(cpfTextField.getText());
        aluno.setData_nascimento(dataSqlConvert);
        aluno.setEmail(emailTextField.getText());
        aluno.setEndereco_idendereco(
            Integer.parseInt(enderecoTextField.getText()));
        aluno.setFone(foneTextField.getText());
        aluno.setNome(nomeTextField.getText());
        aluno.setIdAluno(Integer.parseInt(idAluoTextField.getText()));

        new AlunoDAO().CadastrarAluno(aluno);
      }
    });

    JButton retornarButton = new JButton("Retornar");
    retornarButton.setBounds(10, 265, 320, 25);
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
