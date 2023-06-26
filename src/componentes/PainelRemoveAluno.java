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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PainelRemoveAluno {
  Aluno aluno = new Aluno();

  public JPanel iniciaComponenteRemoveAluno(Container Window) {

    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(0, 0, 800, 600);
    painel.setBorder(BorderFactory.createTitledBorder("Remover Aluno"));

    JLabel alunoLabel = new JLabel("Id Aluno: ");
    alunoLabel.setBounds(10, 25, 150, 25);
    alunoLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(alunoLabel);

    JTextField alunoTextField = new JTextField();
    alunoTextField.setBounds(170, 25, 150, 25);
    painel.add(alunoTextField);

    JButton removerButton = new JButton("Remover");
    removerButton.setBounds(10, 205, 320, 25);
    painel.add(removerButton);
    removerButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        aluno.setIdAluno(Integer.parseInt(alunoTextField.getText()));

        new AlunoDAO().RemoverAluno(aluno);
      }
    });

    JButton retornarButton = new JButton("Retornar");
    retornarButton.setBounds(10, 235, 320, 25);
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
