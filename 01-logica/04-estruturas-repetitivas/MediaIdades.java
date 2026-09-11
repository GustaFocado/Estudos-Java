import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idades;
        int soma;
        double media;
        int contador;

        soma = 0;
        contador = 0;

        System.out.println("Escreva a idade do individuo: ");
        idades = sc.nextInt();

        while (idades >= 0) {

            soma = soma + idades;
            contador++;

            System.out.println("Escreva outra idade: ");
            idades = sc.nextInt();

        }
        if (contador == 0) {
            System.out.println("Impossivel calcular");
        } else {
            media = (double) soma / contador;
            System.out.println(media);
        }

        sc.close();

    }

}
