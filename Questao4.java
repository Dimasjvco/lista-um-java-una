import java.util.Scanner;
public class Questao4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor do capital a ser aplicado:");
     double C = scanner.nextDouble();
    System.out.println("Digite o prazo de aplicação em meses:");
     double n = scanner.nextDouble();
    System.out.println("Digite a taxa de juros mensal(20% = 20):");
     double i = scanner.nextDouble();

    double I = (i / 100 + 1);
    double m = Math.pow(I,n);
    double M = (C * m);

    System.out.printf("O montante a ser recebido é de: R$ %.2f", M);

    sc.close();
  }
}
