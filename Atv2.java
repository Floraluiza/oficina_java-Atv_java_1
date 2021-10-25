// importa biblioteca Scanner
import java.util.Scanner; 

public class Atv2{
    public static void main(String[] args) {
    // DECLARACAO DE VARIAVEIS
    int N, numero, cont, soma;
    // declara uma varivael de leitura do tipo 
    // Scanner
    Scanner ler = new Scanner(System.in);

    // ENTRADA DE DADOS
    // imprime uma mensagem na tela
    System.out.print("digite o valor de N:");
    // le informacao digitada no teclado
    N = ler.nextInt();
    // PROCESSAMENTO
    soma = 0;
    cont=1;
    while(cont<=N){ // laco infinito
      System.out.print("digite o "+cont+"o numero:");
      numero = ler.nextInt();
      soma = soma + numero;
      cont = cont + 1;
    }

    // SAIDA
    System.out.println("soma="+soma);
  }
}