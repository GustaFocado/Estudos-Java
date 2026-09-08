import java.util.Scanner;

public class AumentoSalarial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario;
        double novoSalario;
        double aumento;
        double porcentagem;

        System.out.println("Digite o seu salario: ");
        salario = sc.nextDouble();

        if (salario <= 1000){
            aumento = salario * 0.20;
            novoSalario = salario + aumento;
            porcentagem = 20;
        } else if (salario <= 3000){
            aumento = salario * 0.15;
            novoSalario = salario + aumento;
            porcentagem = 15;
        } else if(salario <=8000){
            aumento = salario * 0.10;
            novoSalario = salario + aumento;
            porcentagem = 10;
        } else {
            aumento = salario * 0.05;
            novoSalario = salario + aumento;
            porcentagem = 5;
            sc.close();
        }

        System.out.println("O seu salario era de: " + salario);
        System.out.print("Voce recebeu um aumento de: " + aumento);
        System.out.print("Que seria a porcentagem de: " + porcentagem + "%");
        System.out.print("O seu novo salario é: " + novoSalario);
        
    }
    
}
