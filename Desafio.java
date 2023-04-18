
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Thiago de Paula Valentim";
        String tipoDeConta = "Corrente";
        Double saldo = 2500.0;

        int operacao = 0;

        System.out.println("********************************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("********************************************");

        String menu = """
                ***** Escolha uma das operações *****             
                         -----------------------
                         | 1- Consultar saldo  |
                         | 2- Receber valor    |
                         | 3- Transferir valor |
                         | 4- Sair             |
                         -----------------------              
                Digite a opção desejada: """;
        while(operacao != 4 ) {
            System.out.print(menu);
            operacao = leitura.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Saldo: R$" + saldo);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Informe o valor a receber:R$");
                    double valor = leitura.nextDouble();
                    saldo+= valor;
                    System.out.println("Saldo atualizado: R$" + saldo);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Informe o valor que deseja transferir: R$");
                    valor = leitura.nextDouble();
                    if (saldo < valor) {
                        System.out.println("Saldo Insuficiente!");
                        System.out.println();
                    } else {
                        saldo -= valor;
                        System.out.println("Saldo atualizado: R$" + saldo);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Operação encerrada.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
            }
        }
    }
}
