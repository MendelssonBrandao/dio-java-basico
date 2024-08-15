public class App {
    public static void main(String[] args)  {
        iPhone iphone = new iPhone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Sunshine");

        System.out.println();
        iphone.ligar("011985738357");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        iphone.exibirPagina("www.google.com");
    }
}
