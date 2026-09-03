import java.util.Scanner;

public class MenorDeTres {
 public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a;
    int b;
    int c;
    int menor;

    System.out.print("Digite um numero inteiro: ");
    a = sc.nextInt();

      System.out.print("Digite um numero inteiro: ");
    b = sc.nextInt();

      System.out.print("Digite um numero inteiro: ");
    c = sc.nextInt();

    menor = a;

if (b < menor) {
    menor = b;
}

if (c < menor) {
    menor = c;
}

System.out.println("Menor: " + menor);
  sc.close();
 }

}
