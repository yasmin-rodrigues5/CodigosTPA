import java.util.Scanner; 
public class Exercicio11 { 
  public static void main(String[] args) { 
 
      Scanner in = new Scanner(System.in); 
      final int TAM=10; 
      int a[], i; 
      a = new int[TAM]; 
 
 
      for(i=0; i<TAM; i++) { 
        System.out.println("Digite aqui por favor o " +(i+1)+" valor do vetor A"); 
        a[i] = in.nextInt(); 
 
      } 
 
 
      System.out.print("\nA = "); 
      for(i=0; i<TAM; i++) { 
        System.out.print(a[i]+ " "); 
      } 
 
 
        System.out.println("\n\nDigite o valor que você gostaria de buscar:"); 
        int x = in.nextInt(); 
 
 
        int cont = 0; 
 
        for(i = 0; i < TAM; i++) { 
            if(a[i] == x) { 
                cont = cont + 1; 
            } 
        } 
 
        if(cont > 0) { 
            System.out.println("O valor " + x + " está no vetor!"); 
        } else { 
            System.out.println("O valor " + x + " não está no vetor!"); 
        } 
 
    } 
       in.close();
 
 
  } 
