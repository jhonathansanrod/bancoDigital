import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcao;
        System.out.println("Nome: jacqueline oliveira");
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial: R$ 2500,00");

        double saldo = 2500;
        double valorRecebido = 0;
        double valorEnviado = 0;

        do {

            double saldoAtualizado;

            System.out.println("\nOperações");

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");

            System.out.println("4- Sair\n");

            System.out.println("Qual a opção? ");
            opcao = leitura.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Valor em conta R$ " + saldo);

                    break;

                case 2:

                    System.out.println("Informe o valor receber:\n");
                    valorRecebido = leitura.nextInt();

                    saldo = saldo + valorRecebido;

                    System.out.println("Saldo atualizado R$ " + saldo);

                    break;
                case 3:

                    System.out.println("Informe o valor que deseja transferir:\n");
                    valorEnviado = leitura.nextInt();

                    if (saldo >= valorEnviado){

                    saldo = saldo - valorEnviado;

                    System.out.println("Saldo atualizado R$ " + saldo);
                } else {
                    System.out.println("Não há saldo suficiente para fazer essa transferência.");
                }
                    break;

                case 4:

                    System.out.println("Saindo da conta.");

                    break;
                default:
                    System.out.println("Opção inválida.\n");
                    break;
            }
        } while (opcao != 4);

    }
}