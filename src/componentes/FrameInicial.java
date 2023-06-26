package componentes;
import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FrameInicial extends JPanel {
    public JPanel telaInicial(Container Window) {
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(0, 0, 800, 600);

        PainelAluno painelAluno = new PainelAluno();
        PainelProfessor painelProfessor = new PainelProfessor();
        PainelCurso painelCurso = new PainelCurso();
        PainelMateria painelMateria = new PainelMateria();
        PainelTurma painelTurma = new PainelTurma();

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



        return painel;
    }
}
