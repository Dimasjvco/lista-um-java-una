import java.util.Scanner;
public class Questao2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o valor do produto:");
    double valor = scanner.nextDouble();
    
    System.out.printf("O novo valor do produto é:" + valor * 1.1);  

    scanner.close();
  }
}
