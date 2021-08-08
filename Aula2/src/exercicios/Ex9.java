/*
 Escreva uma classe Java que leia e imprima a soma e a multiplicação de dois números.
*/
package exercicios;

import java.util.Scanner;

public class Ex9 {
  public static void main(String[] args) {
    int valorUm, valorDois;
    
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Digite um valor ");
    valorUm = ler.nextInt();
    
    System.out.print("Digite outro valor ");
    valorDois = ler.nextInt();
    
    System.out.println("A soma dos dois números é de "+(valorUm+valorDois)+" e a multiplicação destes é "+valorUm*valorDois);
  }
}
