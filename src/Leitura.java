import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filmeFav = leitura.nextLine();
        System.out.println("Por que " + filmeFav + " é seu filme favorito?");
        String motivoDeGostar = leitura.nextLine();
        System.out.println("Que legal então você gosta de " + filmeFav + " por que ele é " + motivoDeGostar);
        System.out.println("Quando lançou esse filme mesmo?");
        int anoLancou = leitura.nextInt();
        System.out.println("Adorei conversar com você!");
    }
}
