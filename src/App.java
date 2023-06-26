import java.awt.Container;
import javax.swing.JFrame;

public class App extends JFrame{

    public App() {
        setSize(800, 600);
        setLayout(null);
        setResizable(false);
        Container Window = getContentPane();

        Frame frame = new Frame();
        Window.add(frame.telaInicial(Window));

        // JTabbedPane tabbedPane = new JTabbedPane();
        // tabbedPane.setFocusable(false);
        // Window.add(painelAluno.iniciaComponentAluno());

        // JLabel label1 = new JLabel("Tab1");
        // JLabel label2 = new JLabel("Tab2");
        // JLabel label3 = new JLabel("Tab3");
        // JLabel label4 = new JLabel("Tab3");
        // JLabel label5 = new JLabel("Tab3");
        // JLabel label6 = new JLabel("Tab3");

        // tabbedPane.add("Aluno", label1);
        // tabbedPane.add("Professor", label2);
        // tabbedPane.add("Curso", label3);
        // tabbedPane.add("Turma", label4);
        // tabbedPane.add("Materia", label5);
        // tabbedPane.add("Endereço", label6);

        setVisible(true);
    }
    public static void main(String[] args) throws Exception {

        new App();
        // System.out.println("Hello, World!");

        // // Aluno a = new Aluno();

        // Professor a = new Professor();

        // a.setCpf("10881245933");
        // a.setData_contratado(new Date(19981115));
        // a.setEmail("vegagabrielvega@gmail.com");
        // a.setFone("(48)99111-8680");
        // a.setNome("Gabriel Rodrigues Bittencourt");
        // a.setSalario((float) 1500);
        // a.setFormacao("Doutro Porraloca");

        // new ProfessorDAO().CadastrarProfessor(a);
    }
}
