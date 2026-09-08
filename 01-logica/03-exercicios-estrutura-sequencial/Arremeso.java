import java.util.Scanner;

public class Arremeso {
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);

    double chanceA;
    double chanceB;
    double chanceC;
    double arremeso;

    System.out.println("Digite a distancia do primeiro arremesso: ");
    chanceA = sc.nextDouble();

    System.out.println("Digite a distancia do segundo arremesso: ");
    chanceB = sc.nextDouble();


    System.out.println("Digite a distancia do terceiro arremesso: ");
    chanceC = sc.nextDouble();

    arremeso = chanceA;

if (chanceB > arremeso) {
    arremeso = chanceB;
}

if (chanceC > arremeso) {
    arremeso = chanceC;
}

System.out.println("Maior distancia: " + arremeso);
    }


}