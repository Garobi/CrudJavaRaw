package entity;

import java.sql.Date;

public class Matriculas {
  private int idMatriculas;
  private int alunoIdAluno;
  private int turmaIdTurma;
  private Date dataMatricula;
  public int getIdMatriculas() { return idMatriculas; }
  public void setIdMatriculas(int idMatriculas) {
    this.idMatriculas = idMatriculas;
  }
  public int getAlunoIdAluno() { return alunoIdAluno; }
  public void setAlunoIdAluno(int alunoIdAluno) {
    this.alunoIdAluno = alunoIdAluno;
  }
  public int getTurmaIdTurma() { return turmaIdTurma; }
  public void setTurmaIdTurma(int turmaIdTurma) {
    this.turmaIdTurma = turmaIdTurma;
  }
  public Date getDataMatricula() { return dataMatricula; }
  public void setDataMatricula(Date dataMatricula) {
    this.dataMatricula = dataMatricula;
  }
}
