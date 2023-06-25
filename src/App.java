import java.sql.Date;

import DAO.AlunoDAO;
import DAO.ProfessorDAO;
import entity.Aluno;
import entity.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Aluno a = new Aluno();

        Professor a = new Professor();

        a.setCpf("10881245933");
        a.setData_contratado(new Date(19981115));
        a.setEmail("vegagabrielvega@gmail.com");
        a.setFone("(48)99111-8680");
        a.setNome("Gabriel Rodrigues Bittencourt");
        a.setSalario((float) 1500);
        a.setFormacao("Doutro Porraloca");

        new ProfessorDAO().CadastrarProfessor(a);
    }
}
