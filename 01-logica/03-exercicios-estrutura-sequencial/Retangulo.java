import java.util.Scanner;

public class Retangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double area;
        double perimetro;
        double diagonal;

        System.out.println("Digite a base do retangulo: ");
        base = sc.nextDouble();

        System.out.println("Digite a altura do retangulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        perimetro = 2* (base + altura);
        diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.printf("Area do retangulo: %.4f%n " ,area);
        System.out.printf("Perimetro do retangulo: %.4f%n " , perimetro);
        System.out.printf("Diagonal do retangulo: %.4f%n " , diagonal);
        
        sc.close();


    }
    
}
