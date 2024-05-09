import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int anoLancou = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println("Quando lançou esse filme mesmo?");
            anoLancou = leitura.nextInt();
            System.out.println("Adorei conversar com você!");
        }
    }
}
