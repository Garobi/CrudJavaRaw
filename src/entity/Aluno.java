package entity;

import java.sql.Date;

public class Aluno {
    private int idAluno;
    private int endereco_idendereco;
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private Date data_nascimento;

    public int getIdAluno() {
        return idAluno;
    }
    public int getEndereco_idendereco() {
        return endereco_idendereco;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public String getFone() {
        return fone;
    }
    public Date getData_nascimento() {
        return data_nascimento;
    }
    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }
    public void setEndereco_idendereco(int endereco_idendereco) {
        this.endereco_idendereco = endereco_idendereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    
}
