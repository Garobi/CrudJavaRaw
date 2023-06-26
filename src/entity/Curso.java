package entity;

public class Curso {
  private int idCurso;
  private String nome;
  private int caraHoraria;
  private String descricao;
  private Double preco;

  public int getIdCurso() { return idCurso; }
  public void setIdCurso(int idCurso) { this.idCurso = idCurso; }
  public String getNome() { return nome; }
  public void setNome(String nome) { this.nome = nome; }
  public int getCaraHoraria() { return caraHoraria; }
  public void setCaraHoraria(int caraHoraria) {
    this.caraHoraria = caraHoraria;
  }
  public String getDescricao() { return descricao; }
  public void setDescricao(String descricao) { this.descricao = descricao; }
  public Double getPreco() { return preco; }
  public void setPreco(Double preco) { this.preco = preco; }
}
