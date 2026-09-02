import java.util.Scanner;

public class Duracao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int duracao;
        int resto;
        int horas;
        int minutos;
        int segundos;

        System.out.println("Digite os segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600;
        resto = duracao % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println("Duraçao em segundos: " + duracao);
        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
