import java.util.Scanner;
public class Questao8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Total de veículos:");
     int veiculos = scanner.nextInt();
    System.out.printf("Total de rodas(Digite um número par):");
     int rodas = scanner.nextInt();
    
     int motos = ((4 * veiculos) - rodas)/2;
     int carros = (veiculos - motos);

    System.out.printf("No estacionamento há " + (carros) + " carros e " + (motos) + " motos");

    scanner.close();
  }
}
