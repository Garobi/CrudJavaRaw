import java.awt.Container;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

import componentes.PainelAluno;
import componentes.PainelCurso;
import componentes.PainelProfessor;
public class Frame extends JPanel {
    public JPanel telaInicial(Container Window) {
        JPanel painel = new JPanel();
        painel.setLayout(null);
        painel.setBounds(0, 0, 800, 600);

        PainelAluno painelAluno = new PainelAluno();
        PainelProfessor painelProfessor = new PainelProfessor();
        PainelCurso painelCurso = new PainelCurso();

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

        // JButton cadastrarProfessor = new JButton("Cadastrar Professor");
        // cadastrarProfessor.setBounds(240, 20, 200, 200);
        // cadastrarProfessor.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(java.awt.event.ActionEvent event) {
        //             Window.add(painelProfessor.iniciaComponentProfessor(Window));
        //             Window.remove(Window.getComponent(0));
        //             Window.revalidate();
        //             Window.repaint();
        //     }
        // });
        // painel.add(cadastrarProfessor);

        // JButton cadastrarProfessor = new JButton("Cadastrar Professor");
        // cadastrarProfessor.setBounds(240, 20, 200, 200);
        // cadastrarProfessor.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(java.awt.event.ActionEvent event) {
        //             Window.add(painelProfessor.iniciaComponentProfessor(Window));
        //             Window.remove(Window.getComponent(0));
        //             Window.revalidate();
        //             Window.repaint();
        //     }
        // });
        // painel.add(cadastrarProfessor);



        return painel;
    }
}
