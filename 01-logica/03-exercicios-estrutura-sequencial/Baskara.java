import java.util.Scanner;

public class Baskara {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);

     double coeA;
     double coeB;
     double coeC;
     double x1;
     double x2;
     double delta;

     System.out.print("Digite o coeficiente A: ");
     coeA = sc.nextDouble();

     System.out.print("Digite o coeficiente B: ");
     coeB = sc.nextDouble();

     System.out.print("Digite o coeficiente C: ");
     coeC = sc.nextDouble();

     delta = (coeB * coeB) - (4 * coeA * coeC);

if (delta < 0) {
    System.out.println("Esta equacao nao possui raizes reais");
} else {
    x1 = (-coeB + Math.sqrt(delta)) / (2 * coeA);
    x2 = (-coeB - Math.sqrt(delta)) / (2 * coeA);

    System.out.printf("X1 = %.4f%n", x1);
    System.out.printf("X2 = %.4f%n", x2);
}
    
sc.close();





    }
}
