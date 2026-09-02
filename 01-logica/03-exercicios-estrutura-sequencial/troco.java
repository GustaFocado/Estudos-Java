import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double preco;
        int quantidade;
        double dinheiroRecebido;
        double troco;
        double totalCompra;
    

        System.out.println("Digite o preço do item: ");
        preco = sc.nextDouble();

        System.out.println("Digite a quantidade de itens: ");
        quantidade = sc.nextInt();

        System.out.println("Digite a quantia de dinheiro:");
        dinheiroRecebido = sc.nextDouble();

        totalCompra = preco * quantidade;
        troco = dinheiroRecebido - totalCompra;

        System.out.println("O seu troco é " + troco);

    }
}
