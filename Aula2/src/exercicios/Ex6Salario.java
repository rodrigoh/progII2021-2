/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês.
*/
package exercicios;

import java.util.Scanner;

public class Ex6Salario {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.print("Qual o valor da hora trabalhada ");
    float valorHora = ler.nextFloat();
    System.out.print("Quantas horas foram trabalhadas no mês ");
    float numeroHoras = ler.nextFloat();
    float salario = valorHora*numeroHoras;
    System.out.printf("Seu salário é de R$%.2f\n",salario);
  }
}
