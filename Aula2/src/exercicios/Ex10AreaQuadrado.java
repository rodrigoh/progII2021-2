/*
 Escreva um programa que calcule a área e o perímetro de um quadrado
*/
package exercicios;

import java.util.Scanner;


public class Ex10AreaQuadrado {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Digite o valor do lado do quadrado ");
    int lado = ler.nextInt();
    
    int area = lado*lado;
    int perimetro = 4*lado;
    
    System.out.println("O quadrado de lado "+lado+"tem área de "+area+"un² e perímetro de "+perimetro+"un");
    
  }
}
