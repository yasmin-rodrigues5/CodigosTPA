import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int TAM = 10;
        int[] a = new int[TAM];

        System.out.println("Digite aqui por favor " + TAM + " números inteiros:");

        for (int i = 0; i < TAM; i++) {
            System.out.print("Digite o elemento A aqui [" + i + "]: ");
            a[i] = in.nextInt();
 }

        in.close(); 

        System.out.println("Resultados:");

        for (int i = 0; i < 10; i++) {
            int elementoAtual = a[i];

            System.out.println("\nElemento A[" + i + "] = " + elementoAtual + ".");
            System.out.print("A relação de 0 até " + elementoAtual + ": ");

            for (int cont = 0; cont <= elementoAtual; cont++) {
                System.out.print(cont);
                if (cont < elementoAtual) {
                    System.out.print("  ");

                }

            }

        }

      in.close();
    }

}

 
