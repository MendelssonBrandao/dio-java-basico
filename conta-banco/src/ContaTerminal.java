import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        // Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);  
        
        System.out.println("Por favor, digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = sc.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
        + agencia + ", conta " + numeroConta + " e saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
