package br.com.ecommercebr;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
  private int id;
  private Cliente cliente;
  private List<Produto> produtos;
  private double valorTotal;
  
  public int getId() {
    return id;
  }

 
  public void setId(int id) {
    this.id = id;
  }
 
  public Cliente getCliente() {
    return cliente;
  }
  
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
  public List<Produto> getProdutos() {
    if(this.produtos == null){
      this.produtos = new ArrayList<Produto>();
    }
    return produtos;
  }
 
  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
  }
  
  public double getValorTotal() {
    for(Produto produto : this.getProdutos()){
      this.setValorTotal(produto.getPreco());
    }
    return valorTotal;
  }
  
  public void setValorTotal(double valorTotal) {
    this.valorTotal += valorTotal;
  }

  public void imprimirPedido(){
    DecimalFormat moedaBr = new DecimalFormat("#,###,###,##0.00");
				System.out.println("\nCódigo: "+this.getId() + "\n"
        +"Consumidor:" + this.getCliente().getNome() + "\n"
				+ "Telefone: " + this.getCliente().getTelefone() + "\n"
				+ "Endereço: " + this.getCliente().getEndereco() + "\n");
				
				System.out.println("-".repeat(40) + "\nITEM     NOME     DESCRICAO     VALOR\n" + "-".repeat(40));
				for (Produto prod : this.getProdutos()) {
					System.out.println(prod.getId() + " ".repeat(4) + prod.getNome() + " ".repeat(4)
					+ prod.getDescricao() + " ".repeat(4) + prod.getPreco());
				}
				System.out.println("\nQtd. Total de Itens" + " ".repeat(18) + this.produtos.size() + "");
				System.out.println("Valor Total (R$)" + " ".repeat(20) + moedaBr.format(getValorTotal()) + "\n");
  }

}
