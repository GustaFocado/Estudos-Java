import java.util.Scanner;

// WHILE -> enquanto a condição for verdadeira
//while (condicao) {
// comandos

// FOR -> quando você sabe quantas vezes quer repetir
//for (int i = 0; i < 10; i++) {
// comandos

//while     → testa antes e depois executa
//do while  → executa primeiro e testa depois
//for       → repetição com contador

//Visualg        Java
//<>             !=
//= comparação   ==
//e              &&
//ou             ||
//mod            %

public class Crescente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite dois numeros: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y) {

            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

            System.out.println("Digite dois numeros: ");
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }

}
