import java.util.Scanner;

public class Pagamento {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String nome;
    double valorHora;
    int horasTrabalhadas;
    double pagamento;

    System.out.println("Digite o nome do funvionario: ");
    nome = sc.nextLine();

    System.out.println("Digite o valor da hora: ");
    valorHora = sc.nextDouble();

    System.out.println("Digite a quantidade de horas trabalhadas: ");
    horasTrabalhadas = sc.nextInt();

    pagamento = valorHora * horasTrabalhadas;

    System.out.println("Nome: " + nome);
    System.out.printf("Valor da hora trabalhada: %.2f%n" , valorHora);
    System.out.printf("Quantidade de horas trabalhadas: %d%n" , horasTrabalhadas);
    System.out.println("O valor a ser pago é: " + pagamento);

    sc.close();
    


  }
    
}
