/*
 Crie uma classe java que leia dois números inteiros e que depois mostre:
O primeiro valor elevado ao segundo valor use Math.pow(número, expoente)
O primeiro valor vezes o segundo valor
O número inverso do primeiro valor (1/número)
A soma do segundo número com a metade do primeiro número
A diferença do primeiro número com o segundo
O número oposto ao primeiro valor (número *(-1))
*/
package exercicios;

import java.util.Scanner;

public class Ex12Opc2 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Entre com um número inteiro ");
    int primeiroNumero = ler.nextInt();
    
    System.out.print("Entre com o segundo número ");
    int segundoNumero = ler.nextInt();
    
    double resposta = (int) Math.pow(primeiroNumero, segundoNumero);
    System.out.println("O primeiro valor elevado ao segundo valor "+resposta);
    
    resposta = primeiroNumero*segundoNumero;
    System.out.println("O primeiro valor vezes o segundo valor "+resposta);
    
    resposta = (double) 1/primeiroNumero;
    System.out.println("O número inverso do primeiro valor "+resposta);
    
    resposta = (double) primeiroNumero/2+segundoNumero;
    System.out.println("A soma do segundo número com a metade do primeiro número "+resposta);
    
    resposta = primeiroNumero-segundoNumero;
    System.out.println("A diferença do primeiro número com o segundo "+resposta);
    
    resposta = primeiroNumero*-1;
    System.out.println("O número oposto ao primeiro valor "+resposta);      
      
  }
}
