import java.util.Scanner;

public class soma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    
        
    int x;
    int y;
    int soma;
    
    System.out.println("Sistema para soma de valores descritos como X e Y: ");
    System.out.println("Digite o valor de X: ");
    x = sc.nextInt();
   

    System.out.println("Digite o valor de Y: ");
    y = sc.nextInt();
    
    soma = x + y;

    System.out.println("O resultado da soma: " + soma);

    sc.close();

    }
    
}
