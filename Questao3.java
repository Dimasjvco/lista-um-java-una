import java.util.Scanner;
public class Questao3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escreva uma temperatura em graus Fahrenhenit(F°):");
      int f = sc.nextInt();
    
    //Aqui coloquei uma linha divisória//
    System.out.println("----------------------------------");
    System.out.printf("Essa temperatura em graus centígrados é: " + (f - 32) / 1.8 + "°C");

    sc.close();
  }
}