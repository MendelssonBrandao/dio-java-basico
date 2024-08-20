package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
      }

      public void removerItem(String nome) {
        
        List<Item> itensParaRemover = new ArrayList<>();
        
        if (!itemList.isEmpty()) {
          for (Item item : itemList) {
            if (item.getNome().equalsIgnoreCase(nome)) {
              itensParaRemover.add(item);
            }
          }
          itemList.removeAll(itensParaRemover);
        } else {
          System.err.println("A lista está vazia!");
        }
      }

      public double calcularValorTotal() {
        double valorTotal = 0.00;
        
        if (!itemList.isEmpty()) {
          for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem; 
          }
        } else {
            System.err.println("A lista está vazia!");
        }
        return valorTotal;
      }

      public void exibirItens() {
        if (!itemList.isEmpty()) {
          System.out.println(this.itemList);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

    @Override
    public String toString() {
        return "CarrinhoDeCompra [itemList=" + itemList + "]";
    }

      
}
