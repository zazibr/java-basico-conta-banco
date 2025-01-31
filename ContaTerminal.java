import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        String agencia = "";
        int numero = 0;
        String nomeCliente = "";
        double saldo = 0.0;

        try {
            System.out.println("Por favor, digite o número da Conta:");
            numero = scanner.nextInt();
            scanner.nextLine(); 
            
        } catch (Exception e) {
            System.out.println("Erro ao ler o número da Conta.");
        }

        try {
            System.out.println("Por favor, digite o número da Agência:");
            agencia = scanner.nextLine();
            
        } catch (Exception e) {
            System.out.println("Erro ao ler o número da Agência.");
        }

        try {
            System.out.println("Por favor, digite o nome do Cliente:");
            nomeCliente = scanner.nextLine();            
        } catch (Exception e) {
            System.out.println("Erro ao ler o nome do Cliente.");
        }


        try {
            System.out.println("Por favor, digite o saldo:");
            saldo = scanner.nextDouble();            
        } catch (Exception e) {
            System.out.println("Erro ao ler o saldo.");
        }



        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." ;
                
       System.out.println(mensagem);

        scanner.close();
    }
}
