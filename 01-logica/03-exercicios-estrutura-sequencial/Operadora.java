import java.util.Scanner;

public class Operadora {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int minutos;
    double valor;

    System.out.print("Digite a quantidade de minutos consumida: ");
    minutos = sc.nextInt();

    valor = 50;

    if(minutos > 100){
        valor = 50 + (minutos - 100) * 2;
    }
    System.out.print("Valor: " + valor);
    sc.close();
}
}
