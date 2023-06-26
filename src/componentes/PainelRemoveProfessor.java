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
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class PainelRemoveProfessor {
  Professor professor = new Professor();

  public JPanel iniciaComponenteRemoveProfessor(Container Window) {

    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(0, 0, 800, 600);
    painel.setBorder(BorderFactory.createTitledBorder("Remover Professor"));

    JLabel professorLabel = new JLabel("Id Professor: ");
    professorLabel.setBounds(10, 25, 150, 25);
    professorLabel.setHorizontalAlignment(SwingConstants.RIGHT);
    painel.add(professorLabel);

    JTextField professorTextField = new JTextField();
    professorTextField.setBounds(170, 25, 150, 25);
    painel.add(professorTextField);

    JButton removerButton = new JButton("Remover");
    removerButton.setBounds(10, 205, 320, 25);
    painel.add(removerButton);
    removerButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        professor.setIdProfessor(
            Integer.parseInt(professorTextField.getText()));

        new ProfessorDAO().RemoverProfessor(professor);
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
