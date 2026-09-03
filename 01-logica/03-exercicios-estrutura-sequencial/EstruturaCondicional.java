import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    double notaA;  
    double notaB ;
    double notaFinal;
 
    System.out.print("Digite a primeira nota: ");
    notaA = sc.nextDouble();

    System.out.print("Digite a segunta nota: ");
    notaB = sc.nextDouble();

    notaFinal = (notaA + notaB) / 2;

    if (notaFinal <60){
      System.out.print("Reprovado");
    }  else {
        System.out.print("Aprovado");


    } 
    sc.close();
    
    }
}
