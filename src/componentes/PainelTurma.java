package componentes;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;

import DAO.TurmaDAO;

import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;

import entity.Turma;

public class PainelTurma {
    
    Turma turma = new Turma();

    public JPanel iniciaComponentTurma(Container Window) {
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(0, 0, 800, 600);
        painel.setBorder(BorderFactory.createTitledBorder("Cadastrar Turma"));

        JLabel codigoLabel = new JLabel("Codigo: ");
        codigoLabel.setBounds(10, 25, 150, 25);
        codigoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        painel.add(codigoLabel);

        JLabel cursoIdCursoLabel = new JLabel("Id Curso:");
        cursoIdCursoLabel.setBounds(10, 55, 150, 25);
        cursoIdCursoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        painel.add(cursoIdCursoLabel);

        JLabel dataInicioLabel = new JLabel("Data de Inicio:");
        dataInicioLabel.setBounds(10, 85, 150, 25);
        dataInicioLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        JTextField codigoTextField = new JTextField();
        codigoTextField.setBounds(170, 25, 150, 25);
        painel.add(codigoTextField);

        JTextField cursoIdCursoTextField = new JTextField();
        cursoIdCursoTextField.setBounds(170, 55, 150, 25);
        painel.add(cursoIdCursoTextField);

        JSpinner dataInicioSpinner = new JSpinner( new SpinnerDateModel());
        DateEditor editor = new DateEditor(dataInicioSpinner, "dd.MM.yyyy");
        dataInicioSpinner.setEditor(editor);
        dataInicioSpinner.setBounds(170, 85, 150, 25);
        painel.add(dataInicioSpinner);


        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(10, 115, 320, 25);
        painel.add(cadastrarButton);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date dateConvert = (java.util.Date) dataInicioSpinner.getValue();
                java.sql.Date dataSqlConvert = new java.sql.Date(dateConvert.getTime());
                turma.setCod(Integer.parseInt(codigoTextField.getText()));
                turma.setCursoIdCurso(Integer.parseInt(cursoIdCursoTextField.getText()));
                turma.setDataInicio(dataSqlConvert);

                new TurmaDAO().CadastrarTurma(turma);
            }
        });

        JButton retornarButton = new JButton("Retornar");
        retornarButton.setBounds(10, 145, 320, 25);
        painel.add(retornarButton);
        retornarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
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
