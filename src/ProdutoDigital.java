public class ProdutoDigital extends Produto{
  private String linkDownload;

  public ProdutoDigital(String nome, double preco, int quantidade, String linkDownload){
    super(nome, preco, quantidade);
    this.linkDownload = linkDownload;
  }

  public void exibir(){
    System.out.println("Nome: " + this.nome + " | Preço: R$ " + this.preco + " | Quantidade: " + this.quantidade + " | Download: " + this.linkDownload);
  }
}
