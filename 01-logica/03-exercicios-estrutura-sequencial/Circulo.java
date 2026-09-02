import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double raio;
        double area;
        double p;

        System.out.println("Digite o valor do raio do circulo: ");
        raio = sc.nextDouble();

        p = 3.14159;
        area = p * (raio * raio);

        System.out.printf("A area do circulo é: %.3f%n" , area);

        sc.close();





        
    }
}