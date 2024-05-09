import java.util.Scanner;

public class sistemaBank {
    public static void main(String[] args) {
        // 1 - Consultar Saldo
        // 2 - Tranferir
        // 3 - Receber
        // 4 - Sair do aplicativo

        Scanner input = new Scanner(System.in);
        double saldoAtual = 2344.50;
        double saldoGoverno = 230000;
        int init = 0;

        System.out.println("""


               #######################################################
                    Bem-Vindo Novamente ao Bank Ficticio 1.0
               
                    Você está conectado como:
                                      
                    Nome: Bruno Gustavo Prado Domingues
                    CPF: 000.111.222-34
                    RG: 2348485-1
                    EMAIL: TESTE@GMAIL.COM
                      
                    Saldo Atual: R$ """ + saldoAtual + """
                    
               #######################################################
                """);

    while (init == 0) {

        System.out.println("""
                                
                Digite a opção que você deseja:
                                
                1- Ver meu saldo
                                
                2- Realizar uma transferencia
                                
                3- Receber dinheiro do governo
                                
                4- Sair do sistema
                """);
               int opcao = input.nextInt();

               if (opcao == 1){
                   System.out.println("Seu saldo atual é de: R$ " + saldoAtual);
               }
               if (opcao == 2){
                   System.out.println("Quanto você deseja transferir?");
                   double removeSaldo = input.nextDouble();
                   if (removeSaldo <= saldoAtual){
                       double saldoAtualizado = saldoAtual - removeSaldo;

                       System.out.println("Seu novo saldo é de: R$ " + saldoAtualizado );
                        saldoAtual = saldoAtualizado;
                   }else{
                       System.out.println("Você não possui saldo suficiente");
                   }

               }
               if (opcao == 3){
                   System.out.println("Quanto você deseja receber do governo?");
                   double recebeSaldo = input.nextDouble();
                   if (recebeSaldo <= saldoGoverno){
                       double saldoAtualizado = saldoAtual + recebeSaldo;

                       System.out.println("Seu novo saldo é de: R$ " + saldoAtualizado );
                       saldoAtual = saldoAtualizado;

                       double saldoGovAtualizado = saldoGoverno - recebeSaldo;
                       saldoGoverno = saldoGovAtualizado;

                   }else{
                       System.out.println("Você não possui saldo suficiente");
                   }

               }
               if (opcao == 4){
                   System.out.println("Saindo do sistema...");
                   break;
               }
        }
    }
}
