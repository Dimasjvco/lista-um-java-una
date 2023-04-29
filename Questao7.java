import java.util.Scanner;
public class Questao7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Salário fixo de um vendedor:");
     double salariofixo = scanner.nextDouble();
    System.out.println("Valor total das vendas no mês");
     double vendasmes = scanner.nextDouble();
    System.out.println("Percentual sobre o total das vendas mensais(20% = 20):");
     double porcentagemtotalvendas = sc.nextDouble();

    System.out.printf("O seu salário total é de: R$" + (salariofixo + vendasmes * porcentagemtotalvendas / 100));
    
    scanner.close();
  }
}
