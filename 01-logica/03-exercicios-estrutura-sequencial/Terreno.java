import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double largura;
        double comprimento;
        double valor_metro_quadrado;
        double area;
        double valor_total;

        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        comprimento = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado: ");
        valor_metro_quadrado = sc.nextDouble();

        area = largura * comprimento;
        valor_total = valor_metro_quadrado * area;

        System.out.printf("Area do terreno: %.2f%n" , area);
        System.out.printf("Valor total do terreno: %.2f%n" , valor_total);

     sc.close();



    }


    
}
