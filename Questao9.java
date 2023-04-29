import java.util.Scanner;
public class Questao9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um quantidade de segundos:");
     int segundos = scanner.nextInt();


     int horas = (segundos / 3600);
     int minutos = (segundos % 3600 / 60);
     int restante = (segundos % 60);

    System.out.printf((horas) + " hora(s) e " + (minutos) + " minuto(s) e " + (restante) + " segundos");

    scanner.close();
  }
}
