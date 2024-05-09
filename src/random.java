import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(10);
        Scanner input = new Scanner(System.in);
        int numeroEscolhido = 0;

        while (numeroAleatorio != numeroEscolhido){
            System.out.println("Escolha um numero de 0 a 10");
            numeroEscolhido = input.nextInt();

            if (numeroEscolhido == numeroAleatorio){
                System.out.println("Você acertou!!");
                break;
            }else{
                System.out.println("Você errou tente novamente");
            }
        }
    }
}
