import java.util.Scanner; 
public class Exercicio14 { 
    public static void main(String[] args) { 
 
        Scanner in = new Scanner(System.in); 
        int[] a = new int[10]; 
        int[] b = new int[10]; 
 
        for (int i = 0; i < 10; i++) { 
            System.out.print("Digite o valor A[" + i + "]: "); 
            a[i] = in.nextInt(); 
 
            if (a[i] % 2 == 0) { 
                b[i] = 1;  
            } else { 
                b[i] = 0;  
            } 
        } 
 
        System.out.println("\nVetor B:"); 
        for (int i = 0; i < 10; i++) { 
            System.out.println("b[" + i + "] = " + b[i]); 
        } 
 
        in.close(); 
    } 
} 
