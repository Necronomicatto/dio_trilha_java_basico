import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ola, digite seu nome: ");
        String nome = scanner.next();

        System.out.print("Digite sua agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite seu numero: ");
        int numero = scanner.nextInt();

        System.out.print("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
