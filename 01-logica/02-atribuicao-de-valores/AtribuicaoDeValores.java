import java.util.Scanner;

 public class AtribuicaoDeValores {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       String nome;
       int idade;
       String cidade;
       double saldo_na_conta;

       System.out.println("Dados do usuario ");

       System.out.println("Digite seu nome: ");
      nome = sc.nextLine();

      System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do scanner após ler um int

        System.out.println("Digite sua cidade: ");
        cidade = sc.nextLine();

       System.out.println("Digite seu saldo na conta: ");
        saldo_na_conta = sc.nextDouble();

        System.out.println("Dados do usuario: " + nome + " " + idade + " " + cidade + " " + saldo_na_conta);

    }
}
    