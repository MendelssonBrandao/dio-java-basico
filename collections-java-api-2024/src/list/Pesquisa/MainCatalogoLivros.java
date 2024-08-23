package list.Pesquisa;

public class MainCatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

    System.out.println("Adiciona livros --------------------------------------------------------");
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador", "Robert C. Martin", 2012);

    System.out.println("Exibindo livros pelo mesmo autor --------------------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    System.out.println("Exibindo livros de autor que não existe  --------------------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

    // Exibindo livros dentro de um intervalo de anos
    System.out.println("Intervalo  --------------------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

    // Exibindo livros dentro de um intervalo de anos (caso em que não há livros no intervalo)
    System.out.println("Intervalo  Inexistente --------------------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

    // Exibindo livros por título
    System.out.println("Por Título  --------------------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

    // Exibindo livros por título (caso em que não há livros com o título especificado)
    System.out.println("Por Título Inexistente  --------------------------------------------------------");
    System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}
