import java.util.Scanner;
public class Questao6 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número:");
     double primeiro_numero = scanner.nextDouble();
    System.out.println("Digite o segundo número:");
     double segundo_numero = scanner.nextDouble();
    
     double resultado = Math.log(n1) / Math.log(n2);
    System.out.printf("O logaritimo de " + primeiro_numero + " na base " + segundo_numero + " é " + resultado);
    
    scanner.close();
  }
}
