import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double distanciaPercorrida;
        double combustivel;
        double comsumoMedio;

        System.out.println("Digite a distancia percorrida: ");
        distanciaPercorrida = sc.nextDouble();

        System.out.println("Digite a quantidade de combustivel: ");
        combustivel = sc.nextDouble();

        comsumoMedio = distanciaPercorrida / combustivel;

        System.out.printf("O consumo médio do veiculo foi de : %.2f%n " , comsumoMedio );

        sc.close();
    }
    
}
