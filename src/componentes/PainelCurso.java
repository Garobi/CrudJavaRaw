package componentes;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import DAO.CursoDAO;
import entity.Curso;

public class PainelCurso {
    Curso curso = new Curso();

    public JPanel iniciaComponentCurso(Container Window) {
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(0, 0, 800, 600);
        painel.setBorder(BorderFactory.createTitledBorder("Cadastrar Curso"));

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(10, 25, 150, 25);
        nomeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        painel.add(nomeLabel);

        JLabel descricaoLabel = new JLabel("Descricao:");
        descricaoLabel.setBounds(10, 55, 150, 25);
        descricaoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        painel.add(descricaoLabel);

        JLabel cargaHorariaLabel = new JLabel("Carga Horaria:");
        cargaHorariaLabel.setBounds(10, 85, 150, 25);
        cargaHorariaLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        painel.add(cargaHorariaLabel);

        JLabel precoLabel = new JLabel("Preço:");
        precoLabel.setBounds(10, 115, 150, 25);
        precoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        painel.add(precoLabel);

        JTextField nomeTextField = new JTextField();
        nomeTextField.setBounds(170, 25, 150, 25);
        painel.add(nomeTextField);

        JTextField descricaoTextField = new JTextField();
        descricaoTextField.setBounds(170, 55, 150, 25);
        painel.add(descricaoTextField);

        JTextField cargaHorariaTextField = new JTextField();
        cargaHorariaTextField.setBounds(170, 85, 150, 25);
        painel.add(cargaHorariaTextField);

        JTextField precoTextField = new JTextField();
        precoTextField.setBounds(170, 115, 150, 25);
        painel.add(precoTextField);


        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setBounds(10, 145, 320, 25);
        painel.add(cadastrarButton);
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                curso.setNome(nomeTextField.getText());
                curso.setDescricao(descricaoTextField.getText());
                curso.setCaraHoraria(Integer.parseInt(cargaHorariaTextField.getText()));
                curso.setPreco(Float.parseFloat(cargaHorariaTextField.getText()));

                new CursoDAO().CadastrarCurso(curso);
            }
        });

        JButton retornarButton = new JButton("Retornar");
        retornarButton.setBounds(10, 175, 320, 25);
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
