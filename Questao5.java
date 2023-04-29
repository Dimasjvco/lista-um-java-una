import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Número de horas que o funcionário trabalhou no mês:");
         double horas = scanner.nextDouble();
        System.out.println("Valor recebido por hora de trabalho:");
         double valorhora = scanner.nextDouble();
        System.out.println("Valor do salário família:");
         double familia = scannernextDouble();
        System.out.println("Número de filhos com idade menor que 14 anos:");
         double filhos = scanner.nextDouble();



         double valorbruto = (horas * valorhora) + filhos * familia;
        System.out.printf("O salário bruto a ser recebido por um funcionário em um mês é de: R$%.2f", valorbruto);

     scanner.close();
    }
}
