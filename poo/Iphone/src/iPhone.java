public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendento chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void ligar(String numero) {
        // TODO Auto-generated method stub
        System.out.println("ligando para: " + numero);
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Pausando música");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void tocar() {
        // TODO Auto-generated method stub
        System.out.println("Tocando música");
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando página web");
    }

    @Override
    public void exibirPagina(String url) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo: " + url);
    }
    
}
