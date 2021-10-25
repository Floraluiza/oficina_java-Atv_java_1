import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
      //declaração de variaveis
      Scanner entrada = new Scanner(System.in);
      int num1, num2, soma, media;

      //
          System.out.println("Digite o primeiro número ");
            num1 = entrada.nextInt();

          System.out.println("Digite o segundo número ");
            num2 = entrada.nextInt();

      soma = num1 + num2;

    System.out.println("Resultado da soma: " + soma);

      media = (num1 + num2)/2;

    System.out.println("Resultado da Média: " + media);
  
  }
}