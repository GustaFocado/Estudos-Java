import java.util.Scanner;

public class Glicose {
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    
    double glicose;

    System.out.println("Digite a medida da sua glicose: ");
    glicose = sc.nextDouble();

    if(glicose <= 100){
        System.out.println("Classificassao normal");
    }else if (glicose <= 140){
        System.out.println("Elevado");
    } else{
        System.out.println("Diabetes");
    }
    sc.close();
}

}
