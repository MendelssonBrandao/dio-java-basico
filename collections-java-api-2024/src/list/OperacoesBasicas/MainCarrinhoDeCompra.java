package list.OperacoesBasicas;

import java.util.Locale;

public class MainCarrinhoDeCompra {

    public static void main(String[] args) {

    Locale.setDefault(Locale.US);    
    
    CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

    // Adicionar itens 
    carrinhoDeCompra.adicionarItem("Mouse",50.0, 2);
    carrinhoDeCompra.adicionarItem("Cadeira", 375d, 1);
    carrinhoDeCompra.adicionarItem("Caderno", 15.0, 3);
    carrinhoDeCompra.adicionarItem("Teclado", 99.0, 4);
    carrinhoDeCompra.adicionarItem("Video Game", 3490.0, 1);

    // Exibir itens no carrinho
    carrinhoDeCompra.exibirItens();

    // Remover um item do carrinho
    carrinhoDeCompra.removerItem("Teclado");

    // Exibir itens atuais no carrinho
    carrinhoDeCompra.exibirItens();

    // Calculr o valor total da compra
    System.out.printf("O valor total da compra é = %.2f" , carrinhoDeCompra.calcularValorTotal());
    }

}