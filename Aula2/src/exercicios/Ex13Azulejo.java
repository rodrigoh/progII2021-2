/*
Escreva um programa para ler as dimensões de uma cozinha retangular (comprimento, largura e altura), 
calcular e escrever a quantidade de caixas de azulejos para se colocar em todas as suas paredes. 
Também deve ser lido um valor equivalente a área das Janelas e portas para descontar da área total. 
Cada caixa de azulejos possui 1,5 m2.
*/

package exercicios;

import java.util.Scanner;

public class Ex13Azulejo {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    double comprimento;
    double largura;
    double altura;
    double areaAberturas;
    
    System.out.print("Entre com o comprimento da cozinha em metros ");
    comprimento = ler.nextDouble();
    
    System.out.print("Entre com a largura da cozinha ");
    largura = ler.nextDouble();
    
    System.out.print("Entre com a altura da cozinha ");
    altura = ler.nextDouble();
    
    System.out.print("Entre com a área de aberturas da cozinha ");
    areaAberturas = ler.nextDouble();
    
    
    double areaP1 = comprimento*altura;
    double areaP2 = largura*altura;
    
    double areaTotal = (areaP1*2+areaP2*2)-areaAberturas;
    
    double quantCaixas = areaTotal/1.5;
    
    System.out.println("Para cobrir todas as paredes com azulejos serão necessárias "+quantCaixas+" de azulejos.");
  }
}
