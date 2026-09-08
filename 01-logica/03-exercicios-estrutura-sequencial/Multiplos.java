import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numeroA;
        int numeroB;

        System.out.println("Digite o primeiro numero: ");
        numeroA = sc.nextInt();

        System.out.println("Digite o segundo numero: ");
        numeroB = sc.nextInt();

        if (numeroA % numeroB ==0){
            System.out.println("Sao multiplos");
        } else {
            System.out.println("Nao sao multiplos");
        }
        sc.close();
    }
    
}
