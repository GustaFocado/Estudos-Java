import java.util.Scanner;

public class Medidas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        double areaA;
        double areaB;
        double areaC;

       System.out.println("Digite a medida A: ");
       a = sc.nextDouble();

       System.out.println("Digite a medida B: ");
       b = sc.nextDouble();

       System.out.println("Digite a medida C: ");
       c = sc.nextDouble();

       areaA = a * a;
       areaB = (a * b) / 2;
       areaC = ((a + b) * c) / 2;

       System.out.printf("A area do quadrado é: %.4f%n " , areaA);
       System.err.printf("A area do triangulo é: %.4f%n " , areaB);
       System.out.printf("A area do trapezio é: %.4f%n" , areaC);

       sc.close();

    }
    
}
