import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numeroUsuario = 0;
        int numeroSorteado = new Random().nextInt(100);
        Scanner scan = new Scanner(System.in);

        System.out.println("######## JOGO DA ADIVINHAÇÃO ########");
        for(int i = 1; i <= 5; i++) {

            System.out.printf("Informe o número (Chances %d/5): ".formatted(i));
            numeroUsuario = scan.nextInt();

            if(numeroUsuario == numeroSorteado) {
                System.out.println("Parabéns você acertou!!");
                break;
            } else {
                System.out.println("""
                                   Que pena você errou! :(
                                   ######## DICA ########""");
                if(numeroUsuario > numeroSorteado) {
                    System.out.println("O número aleatório é menor que o número que você digitou");
                } else {
                    System.out.println("O número aleatório é maior que o número que você digitou");
                }
                System.out.println("######################");
            }
        }

        System.out.println("""
                Jogo finalizado
                Número sorteado pelo sistema: """ + numeroSorteado);

    }
}