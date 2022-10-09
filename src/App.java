
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a medida do lado do quadrado");
        double lado = entrada.nextDouble();

        double l = lado * lado; 
        double A = l * 2;
        
        
        System.out.println("O resultado do dobro da área é de:" + A);


    }
}
