import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    //Cria a lista
    ArrayList<Produto> listaProdutos = new ArrayList<>();

    //Cria os produtos
    Produto p1 = new Produto("Arroz", 5.99, 2);
    Produto p2 = new Produto("Feijão", 6.99, 4);
    Produto p3 = new Produto("Peixe", 10.99, 6);
    ProdutoDigital pd1 = new ProdutoDigital("Photoshop", 244, 3,"www.adobe.com");
    ProdutoDigital pd2 = new ProdutoDigital("Illustrator", 224, 3, "www.adobe.com");

    //Cadastra os itens
    p1.cadastrar(listaProdutos);
    p2.cadastrar(listaProdutos);
    p3.cadastrar(listaProdutos);
    pd1.cadastrar(listaProdutos);
    pd2.cadastrar(listaProdutos);

    //Imprime os produtos
    for (Produto item:listaProdutos){
      item.exibir();
    }

  }
}