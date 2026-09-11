import java.util.Scanner;

public class VerificacaoNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;
        double media;

        System.out.print("Digite a primeira nota do aluno: ");
        x = sc.nextInt();

        while ((x < 0) || (x > 10)) {
            System.out.print("Nota invalida! digite novamente: ");
            x = sc.nextInt();
        }

        System.out.print("Digite a segunda nota do aluno: ");
        y = sc.nextInt();

        while ((y < 0) || (y > 10)) {
            System.out.print("Nota invalida! digite novamente: ");
            y = sc.nextInt();
        }

        media = (x + y) / 2;

        System.out.println(media);
        sc.close();

    }

}
