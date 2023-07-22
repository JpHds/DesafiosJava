/*Atividade do bootcamp da DIO, consiste na criação de um código em JAVA para ler um caracter MAIÚSCULO,
e com uma matriz 12x12 calcular e mostrar a soma ou média dos valores abaixo da sua diagonal principal 
baseado no caracter lido(M ou S).

Optei também por adicional a impressão da matriz final e gerar os números da mesma aleatoriamente 
limitando o valor a < 10, ao invés de pedir ao usuário os 144(12x12).

Esse é o meu primeiro "desafio" postado por aqui. Obrigado! :D*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AbaixoDiagonalPrincipal {
  public static void main(String[] args) {
      DecimalFormat formatador = new DecimalFormat("#0.0");
      Random random = new Random();
      Scanner leitor = new Scanner(System.in);
      ArrayList<Double> lista = new ArrayList<>();
      char O = leitor.next().toUpperCase().charAt(0);
      Double[][] G = new Double[12][12];
      for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 12; j++) {  
            G[i][j] = random.nextDouble(10);       
            if(i>j) {
            lista.add(G[i][j]);
            }
        }
      }
      for(int i = 0; i < 12; i++) {
        for(int j = 0; j < 12; j++) {
          System.out.print(formatador.format(G[i][j]) + "\t");
        }
        System.out.println();
      }
      System.out.println();
      double soma = 0;
      double media;
      for(int c = 0; c < lista.size(); c++) {
        soma += lista.get(c);
      }
      if (O == 'S') {
        System.out.printf("%.1f", soma);
      } else if(O == 'M') {
        media = soma/lista.size();
        System.out.printf("%.1f", media);
      } else {
        System.out.println("Impossível realizar a operação se não de soma(S) ou média(M)");
      }
  }
}