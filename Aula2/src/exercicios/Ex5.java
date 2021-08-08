//Faça um programa em Java que calcule a área de um círculo
package exercicios;

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Digite o raio do círulo ");
    double raio = ler.nextDouble();
    //double area = 3.14*raio*raio;
    double area = Math.PI*raio*raio;
    
    System.out.printf("O círculo de raio %f tem área igual a %.2fun²\n",raio, area);
    
  }
}
