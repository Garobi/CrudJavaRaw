package entity;

import java.sql.Date;

public class Turma {
    private int cod;
    private Date dataInicio;
    private int cursoIdCurso;
    
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
    public int getCursoIdCurso() {
        return cursoIdCurso;
    }
    public void setCursoIdCurso(int cursoIdCurso) {
        this.cursoIdCurso = cursoIdCurso;
    }

    
}
