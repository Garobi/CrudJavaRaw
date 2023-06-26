package componentes;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import javax.swing.JSpinner.DateEditor;

import DAO.AlunoDAO;
import entity.Aluno;

public class PainelAluno extends JPanel {

    Aluno aluno = new Aluno();

    public JPanel iniciaComponentAluno(Container Window){
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(0, 0, 800, 600);
        painel.setBorder(BorderFactory.createTitledBorder("Cadastrar Aluno"));

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

        JSpinner dataNascimentSpinner = new JSpinner( new SpinnerDateModel());
        DateEditor editor = new DateEditor(dataNascimentSpinner, "dd.MM.yyyy");
        dataNascimentSpinner.setEditor(editor);
        dataNascimentSpinner.setBounds(170, 145, 150, 25);
        painel.add(dataNascimentSpinner);

        JTextField enderecoTextField = new JTextField();
        enderecoTextField.setBounds(170, 175, 150, 25);
        painel.add(enderecoTextField);


        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(10, 205, 320, 25);
        painel.add(cadastrarButton);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date dateConvert = (java.util.Date) dataNascimentSpinner.getValue();
                java.sql.Date dataSqlConvert = new java.sql.Date(dateConvert.getTime());
                aluno.setCpf(cpfTextField.getText());
                aluno.setData_nascimento(dataSqlConvert);
                aluno.setEmail(emailTextField.getText());
                aluno.setEndereco_idendereco( Integer.parseInt(enderecoTextField.getText()));
                aluno.setFone(foneTextField.getText());
                aluno.setNome(nomeTextField.getText());

                new AlunoDAO().CadastrarAluno(aluno);
            }
        });

        return painel;
    }
}
