/*
Faça um Programa que peça a temperatura em graus Fahrenheit, 
transforme e mostre a temperatura em graus Celsius. C = (5 * (F-32) / 9)
*/
package exercicios;

import java.util.Scanner;

public class Ex8TempFC {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Entre com uma temperatura em ºF ");
    double tempF = ler.nextDouble();
    double tempC = 5*(tempF-32)/9;
    System.out.println(tempF+"ºF equivale a "+tempC+"°C");
    System.out.printf("%f ºF equivale a %.2fºC",tempF,tempC);
  }
}
