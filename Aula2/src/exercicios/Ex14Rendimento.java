/*
 Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço 
do combustível é de R$ 4,15, escreva um programa para ler: a marcação do odômetro (Km) no início 
do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) 
recebido dos passageiros. Calcular e escrever: 

a média do consumo em Km/L e o lucro (líquido) do dia.

*/

package exercicios;

import java.util.Scanner;

public class Ex14Rendimento {
  
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Entre com km inicial ");
    int kmInicial = ler.nextInt();
    
    System.out.print("Entre cmo a km final ");
    int kmFinal = ler.nextInt();
    
    System.out.print("Entre com a quantidade de litros utilizados ");
    double quantComb = ler.nextDouble();
    
    System.out.print("Entre com o valor bruto recebido R$");
    double valorBruto = ler.nextDouble();
    
    int kmPercorridos = kmFinal-kmInicial;
    
    double autonomia = kmPercorridos/quantComb;
    
    double lucro = valorBruto-quantComb*4.15;
    
    System.out.printf("Para percorrer %dkm você utilizou %f litros de combustível e teve um lucro de R$%.2f. \nSeu veículo está percorrento %.3fkm/l\n",kmPercorridos,quantComb,lucro,autonomia);
  }
}
