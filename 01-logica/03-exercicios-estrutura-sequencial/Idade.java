import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String nome;
        Integer idade;

        String nome_b;
        Integer idade_b;

        double mediaIdade;
        
        System.out.println("Sistema de calculo de media de idades");
        System.out.println("Dados da primeira pessoa: ");
       
        System.out.println("Digite o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Dados da segunda pessoa: ");

        System.out.println("Digite o seu nome: ");
        nome_b = sc.nextLine();

        System.out.println("Digite a sua idade: ");
        idade_b = sc.nextInt();

        mediaIdade = (idade + idade_b) / 2.0;

        System.out.println("Dados da primeira pessoa: ");
         System.out.println("Nome: " + nome );
          System.out.println("Idade: " + idade);

           System.out.println("Dados da segunda pessoa: ");
            System.out.println("Nome: "+ nome_b);
             System.out.println("Idade " + idade_b);

              System.out.printf("Media de idade: %.1f%n " , mediaIdade);
              sc.close();







        

    }
}
