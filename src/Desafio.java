import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lendo os dados de Entrada:
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consumindo a quebra de linha

        System.out.print("Nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

        System.out.println("Informações da conta:");
        // Imprimir as informações da conta usando o objeto criado acima.
        System.out.println("Número da conta: " + conta.numero);
        System.out.println("Nome do titular: " + conta.titular);
        System.out.println("Saldo atual: R$ " + conta.saldo);
    }
}

class ContaBancaria {
    int numero;
    String titular;
    double saldo;

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
}
