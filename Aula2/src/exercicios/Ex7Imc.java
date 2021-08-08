/** Faça uma classe Java que leia a altura e o peso de uma pessoa e calcule seu IMC IMC = peso/altura² */
package exercicios;

import java.util.Scanner;


public class Ex7Imc {
  public static void main(String[] args) {
    Scanner obter = new Scanner(System.in);
    
    System.out.print("Entre com seu peso em kg ");
    float peso = obter.nextFloat();
    
    System.out.print("Entre com sua altura em metros ");
    float altura = obter.nextFloat();
    
    float imc = peso/(altura*altura);
    
    System.out.println("Seu índice de massa corporal é de "+imc);
  }
}
