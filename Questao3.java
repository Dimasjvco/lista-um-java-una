import java.util.Scanner;
public class Questao3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Escreva uma temperatura em graus Fahrenhenit(F°):");
      int Fahrenhenit = scanner.nextInt();
    
    System.out.printf("Essa temperatura em graus centígrados é: " + (Fahrenhenit - 32) / 1.8 + "°C");

    scanner.close();
  }
}
