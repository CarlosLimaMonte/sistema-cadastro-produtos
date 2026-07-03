import java.util.ArrayList;

public class Produto implements Cadastravel{
  protected String nome;
  protected double preco;
  protected int quantidade;

  public Produto (String nome, double preco, int quantidade){
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public boolean cadastrar(ArrayList<Produto> lista){
    lista.add(this);
    return true;
  }

  public void exibir(){
    System.out.println("Nome: " + this.nome + " | Preço: R$ " + this.preco + " | Quantidade: " + this.quantidade);
  }
}
