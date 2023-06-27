package componentes;
import DAO.ProfessorDAO;
import entity.Professor;
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

public class PainelEditarProfessor {

  Professor professor = new Professor();

  public JPanel iniciaComponentProfessor(Container Window) {
    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(0, 0, 800, 600);
    painel.setBorder(BorderFactory.createTitledBorder("Cadastrar Professor"));

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

    JLabel salarioLabel = new JLabel("Salario:");
    salarioLabel.setBounds(10, 175, 150, 25);
    salarioLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(salarioLabel);

    JLabel formacaoLabel = new JLabel("Formaçao:");
    formacaoLabel.setBounds(10, 205, 150, 25);
    formacaoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(formacaoLabel);

    JLabel idProfessorLabel = new JLabel("ID Professor:");
    idProfessorLabel.setBounds(10, 235, 150, 25);
    idProfessorLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(idProfessorLabel);

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

    JTextField salarioTextField = new JTextField();
    salarioTextField.setBounds(170, 175, 150, 25);
    painel.add(salarioTextField);

    JTextField formacaoTextField = new JTextField();
    formacaoTextField.setBounds(170, 205, 150, 25);
    painel.add(formacaoTextField);

    JTextField idProfessorTextField = new JTextField();
    idProfessorTextField.setBounds(170, 235, 150, 25);
    painel.add(idProfessorTextField);

    JButton cadastrarButton = new JButton("Cadastrar");
    cadastrarButton.setBounds(10, 265, 320, 25);
    painel.add(cadastrarButton);
    cadastrarButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        java.util.Date dateConvert =
            (java.util.Date)dataNascimentSpinner.getValue();
        java.sql.Date dataSqlConvert = new java.sql.Date(dateConvert.getTime());
        professor.setCpf(cpfTextField.getText());
        professor.setData_contratado(dataSqlConvert);
        professor.setEmail(emailTextField.getText());
        professor.setSalario(Float.parseFloat(salarioTextField.getText()));
        professor.setFone(foneTextField.getText());
        professor.setNome(nomeTextField.getText());
        professor.setFormacao(formacaoTextField.getText());
        professor.setIdProfessor(
            Integer.parseInt(idProfessorTextField.getText()));

        new ProfessorDAO().CadastrarProfessor(professor);
      }
    });

    JButton retornarButton = new JButton("Retornar");
    retornarButton.setBounds(10, 295, 320, 25);
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
