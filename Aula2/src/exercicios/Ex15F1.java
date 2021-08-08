/*
 Uma equipe de Fórmula 1 deseja calcular o número mínimo de litros que deverá colocar 
no tanque de seu carro para que ele possa percorrer um determinado número de voltas até 
o primeiro reabastecimento. Escreva um programa que leia o comprimento da pista (em metros), 
o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos 
desejados e o consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo 
de litros necessários para percorrer até o primeiro reabastecimento. 
Observação: Considere que o número de voltas entre os reabastecimentos é o mesmo. 
*/

package exercicios;

import java.util.Scanner;

public class Ex15F1 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.print("Entre com o comprimento da pista em metros ");
    float comprimentoPista = ler.nextFloat();
    
    //Convertendo o comprimento de metros para km
    comprimentoPista/=1000;
    
    System.out.print("Qual o número total de voltas do GP ");
    int nVoltas = ler.nextInt();
    
    System.out.print("Quantos reabastecimentos são permitidos ");
    int nReabastecimento = ler.nextInt();
    
    System.out.print("Entre com a autonomina do carro ");
    double autonomia = ler.nextDouble();
    
    double distanciaTotal = comprimentoPista*nVoltas;
    
    double quanLitrosTotal = distanciaTotal/autonomia;
    
    double litrosReabastecimento = quanLitrosTotal/nReabastecimento;
    
    System.out.printf("Para perceorrer os %.2f kms do GP, com %d reabastecimentos \na cada reabastecimento será necessário abastecer %.2f litros\n",distanciaTotal,nReabastecimento,litrosReabastecimento);
    
    
    
    
  }
}
