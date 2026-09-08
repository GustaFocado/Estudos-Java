import java.util.Scanner;

public class tempoDeJogo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.print("Escreva a hora inicial do jogo: ");
        horaInicial = sc.nextInt();

        System.out.print("Escreva a hora final do jogo: ");
        horaFinal = sc.nextInt();

        if (horaInicial > horaFinal){
            duracao = horaInicial - horaFinal;
        } else {
            duracao = (24 - horaInicial) +  horaFinal;
        }
        System.out.println("Duraçao de jogo: " + duracao + "Horas");
        sc.close();
            
        }
    }
