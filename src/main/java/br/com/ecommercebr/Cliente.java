package br.com.ecommercebr;

public class Cliente {
  private String id;
  private String nome;
  private String telefone;
  private String endereco;
 
  public String getId() {
    return id;
  }
 
  public void setId(String id) {
    this.id = id;
  }
 
  public String getNome() {
    if(this.nome == null)
      this.nome = "Consumidor Não Identificado";
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public String getTelefone() {
    if(this.telefone == null)
      this.telefone = "( )   -";
    return telefone;
  }
  
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
  
  public String getEndereco() {
    if(this.endereco == null)
      this.endereco = " ";
    return endereco;
  }
  
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }
}
