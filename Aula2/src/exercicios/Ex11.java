/*
 Escreva um programa que calcula a área de um triângulo
*/
package exercicios;

import java.util.Scanner;

public class Ex11 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Entre com o valor da base do triângulo ");
    float base = ler.nextFloat();
    
    System.out.print("Entre com o valor da altura do triângulo ");
    float altura = ler.nextFloat();
    
    float area = (base*altura)/2;
    
    System.out.printf("O triângulo possui %.2fun²\n",area);
  }
}
