package componentes;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FrameInicial extends JPanel {
  public JPanel telaInicial(Container Window) {
    JPanel painel = new JPanel();
    painel.setLayout(null);
    painel.setBounds(0, 0, 800, 1020);

    PainelAluno painelAluno = new PainelAluno();
    PainelProfessor painelProfessor = new PainelProfessor();
    PainelCurso painelCurso = new PainelCurso();
    PainelMateria painelMateria = new PainelMateria();
    PainelTurma painelTurma = new PainelTurma();
    PainelMatricularAluno painelMatricularAluno = new PainelMatricularAluno();
    PainelRemoveAluno painelRemoveAluno = new PainelRemoveAluno();
    PainelRemoveProfessor painelRemoveProfessor = new PainelRemoveProfessor();
    PainelEditarAluno painelEditarAluno = new PainelEditarAluno();
    PainelEditarProfessor painelEditarProfessor = new PainelEditarProfessor();
    PainelLerAluno painelLerAluno = new PainelLerAluno();

    JButton cadastrarAluno = new JButton("Cadastrar Aluno");
    cadastrarAluno.setBounds(20, 20, 200, 200);
    cadastrarAluno.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelAluno.iniciaComponentAluno(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(cadastrarAluno);

    JButton cadastrarProfessor = new JButton("Cadastrar Professor");
    cadastrarProfessor.setBounds(240, 20, 200, 200);
    cadastrarProfessor.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelProfessor.iniciaComponentProfessor(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(cadastrarProfessor);

    JButton cadastrarCurso = new JButton("Cadastrar Curso");
    cadastrarCurso.setBounds(460, 20, 200, 200);
    cadastrarCurso.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelCurso.iniciaComponentCurso(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(cadastrarCurso);

    JButton cadastrarMateria = new JButton("Cadastrar Materia");
    cadastrarMateria.setBounds(20, 240, 200, 200);
    cadastrarMateria.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelMateria.iniciaComponentMateria(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(cadastrarMateria);

    JButton cadastrarTurma = new JButton("Cadastrar Turma");
    cadastrarTurma.setBounds(240, 240, 200, 200);
    cadastrarTurma.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelTurma.iniciaComponentTurma(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(cadastrarTurma);

    JButton matricularAluno = new JButton("Matricular Aluno");
    matricularAluno.setBounds(460, 240, 200, 200);
    matricularAluno.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelMatricularAluno.iniciaComponentMatricula(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(matricularAluno);

    JButton removerAluno = new JButton("Remover Aluno");
    removerAluno.setBounds(20, 460, 200, 200);
    removerAluno.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelRemoveAluno.iniciaComponenteRemoveAluno(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(removerAluno);

    JButton removerProfessor = new JButton("Remover Professor");
    removerProfessor.setBounds(240, 460, 200, 200);
    removerProfessor.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(
            painelRemoveProfessor.iniciaComponenteRemoveProfessor(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(removerProfessor);

    JButton editarAluno = new JButton("Editar Aluno");
    editarAluno.setBounds(460, 460, 200, 200);
    editarAluno.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelEditarAluno.iniciaComponentAluno(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(editarAluno);

    JButton editarProfessor = new JButton("Editar Professor");
    editarProfessor.setBounds(20, 680, 200, 200);
    editarProfessor.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelEditarProfessor.iniciaComponentProfessor(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(editarProfessor);

    JButton lerAluno = new JButton("Ler Aluno");
    lerAluno.setBounds(240, 680, 200, 200);
    lerAluno.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(java.awt.event.ActionEvent event) {
        Window.add(painelLerAluno.IniciaComponenteLerAluno(Window));
        Window.remove(Window.getComponent(0));
        Window.revalidate();
        Window.repaint();
      }
    });
    painel.add(lerAluno);

    return painel;
  }
}
