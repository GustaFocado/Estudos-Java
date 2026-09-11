import java.util.Scanner;

public class VerificaçaoSenha {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int senha , tentativa;

        System.out.println("Crie uma senha numerica de 4 digitos: ");
        senha = sc.nextInt();

        System.out.println("Digite a senha criada: ");
        tentativa = sc.nextInt();

        while (senha != tentativa) {
            System.err.println("Senha invalida! , tente novamente: ");
            tentativa = sc.nextInt();
            
        }
        System.out.println("Acesso concedido");
        sc.close();
    }
    

}
