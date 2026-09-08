import java.util.Scanner;

public class VerificacaoDeTroco {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precoProduto;
        int quantidade;
        double dinheiro;
        double troco;
        double totalCompra;
        double faltante;

        System.out.println("Digite o preço do produto: ");
        precoProduto = sc.nextDouble();

        System.out.println("Digite a quantidade de itens: ");
        quantidade = sc.nextInt();

        System.out.println("Digite o valor que sera pago: ");
        dinheiro = sc.nextDouble();

        totalCompra = quantidade * precoProduto;
        troco = dinheiro - totalCompra;
        faltante = totalCompra -dinheiro;

        if(dinheiro < totalCompra){
            System.out.println("Valor insuficiente");
        }else{
                System.out.println("O troco é: " + troco);


            }
        
    }
    
}
