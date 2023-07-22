import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AcimaDiagonalSecundaria {
  public static void main(String[] args) {
      Random random = new Random();
      Scanner leitor = new Scanner(System.in);
      ArrayList<Double> lista = new ArrayList<>();
      char O = leitor.next().toUpperCase().charAt(0);
      Double[][] G = new Double[12][12];
      for(int i = 0; i < 11; i++) {
        for(int j = 0; j < 11-i; j++) {  
            G[i][j] = random.nextDouble(10);       
            lista.add(G[i][j]);
        }
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

      leitor.close();
  }
}
