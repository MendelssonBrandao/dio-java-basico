public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ?: " + smartTv.isLigada());
        System.out.println("Canal atual: " + smartTv.getCanal());
        System.out.println("Volume atual: " + smartTv.getVolume());

        smartTv.ligar();
        System.out.println("Tv ligada ?: " + smartTv.isLigada());

        smartTv.diminuirVolume(); smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.getVolume());

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.getCanal());

    }
}
