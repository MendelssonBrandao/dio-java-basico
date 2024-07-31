import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    
    public static void main(String[] args) {
        double mesada = 50.00 ; 
        
        while (mesada>0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce>mesada)
                valorDoce = mesada;

            System.out.println("Doce no valor de " + valorDoce + " adicionado ao carrinho");
            mesada -= valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joazinho gastou toda sua mesada em doce");
    }

    private static double valorAleatorio () { 
        return ThreadLocalRandom.current().nextDouble(2,8); 
    }
}
