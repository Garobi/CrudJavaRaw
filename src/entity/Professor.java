package entity;

import java.sql.Date;

public class Professor {
    private int idProfessor;
    private Float salario;
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private String formacao;
    private Date data_contratado;
    
    public int getIdProfessor() {
        return idProfessor;
    }
    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }
    public Float getSalario() {
        return salario;
    }
    public void setSalario(Float salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    public Date getData_contratado() {
        return data_contratado;
    }
    public void setData_contratado(Date data_contratado) {
        this.data_contratado = data_contratado;
    }
}
