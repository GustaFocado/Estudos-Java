import java.util.Scanner;

public class CalculoPreco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo;
        double preco;
        int quantidade;
        double total;

        System.out.println("Digite o codigo do produto de 1 a 5: ");
        codigo = sc.nextInt();

        System.out.println("Digite a quantidade do produto: ");
        quantidade = sc.nextInt();

        if (codigo == 1){
            preco = 5.00;
        } else if (codigo == 2){
            preco = 3.50;
    }   else if (codigo == 3){
        preco = 4.80;
    } else if (codigo == 4){
        preco = 8.90;

    } else if (codigo == 5){
        preco = 7.32;
    } else {
        System.out.println("Codigo invalido");
        sc.close();
        return;
    }

    total = preco * quantidade;

    System.err.println("Preco total : " + total);
    }    
}
