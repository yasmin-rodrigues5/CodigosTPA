import java.util.Scanner; 
public class Exercicio13 { 
   public static void main(String[] args) { 
       Scanner in = new Scanner(System.in); 
    int a[], cont, f, i, s, ex; 
 
   a = new int[10]; 
 
   for(cont=0; cont<10; cont++) { 
    s = cont + 1; 
    System.out.println("Digite aqui por favor o "+s+"° valor do elemento do vetor:"); 
    a[cont] = in.nextInt(); 
   } 
 
   ex = 0; 
 
   for(i = 0; i < 5; i++) { 
           f = 9 - i;  
    if (a[i] == a[f]) { 
 
    ex++;  
    } 
   } 
 
 
   if(ex == 5) {  
    System.out.println("Os números armazenados no vetor A são palíndromos"); 
   } else { 
    System.out.println("Os números armazenados no vetor A não são palíndromos"); 
   } 
 
       in.close(); 
   } 
} 
