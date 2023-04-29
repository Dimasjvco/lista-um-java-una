import java.util.Scanner;
public class Questao1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     
    System.out.printf("Digite o primeiro número:");
     double primeiro_numero = scanner.nextDouble();
    System.out.printf("Digite o segundo número:");
     double segundo_numero = scanner.nextDouble();
    
    double media_arimetica = (primeiro_numero + segundo_numero2)/2;

    System.out.println("A média aritmética de " + primeiro_numero + " e " + segundo_numero + " é: " + media_arimetica);
        
    scanner.close();
  }
}
