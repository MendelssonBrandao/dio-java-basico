public class SmartTv {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
    
    public void ligar() {
        this.ligada = true;
    }

    public void desligar() { 
        this.ligada = false;
    }

    void aumentarVolume() { 
        this.volume++;
    }

    void diminuirVolume() {
        this.volume--;
    }

    void mudarCanal(int canal) {
        this.canal = canal;
    }

    void aumentarCanal() { 
        this.canal++;
    }

    void diminuirCanal() {
        this.canal--;
    }

    @Override
    public String toString() {
        return "SmartTv []";
    }

    
}