import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while (opcao >= 0){
            System.out.println("""
                    Selecione a opção desejada:
                    1- Executar novamente
                    2- Parar de executar
                    """);
            opcao = leitura.nextInt();
            if (opcao == 2){
                break;
            }
        }
    }
}
