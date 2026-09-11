import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int codigo;

        System.out.println("Escreva o cogido 1,2,3 ou 4 para parar: ");
        codigo = sc.nextInt();

        while (codigo != 4) {

            if (codigo == 1) {
                System.out.print("Alcoll ");

            } else if (codigo == 2) {
                System.out.print("Gasolina ");

            } else if (codigo == 3) {
                System.out.print("Diesel ");

            } else {
                System.out.print("Codico invalido! ");
            }
            System.out.print("Digite outro codigo: ");
            codigo = sc.nextInt();
        }
        System.out.println("Muito obrigado!");
        sc.close();
    }


}
