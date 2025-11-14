import java.util.Scanner;

public class Exercicio1 {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int a[], i, b[], elemento, j;

   a = new int[20];
   b = new int[20];


   elemento = 1;


   for(i=0; i<20; i++) {

    System.out.println("Escreva o valor do "+elemento+"º elemento armazenado no vetor A");
elemento++;
    a[i] = in.nextInt();


   }


       System.out.println("\n--- Vetor B ---");

   j = 0;

   for(i = 0; i<20; i++) {

    if (a[i] % 2 == 0) {
    b[j] = a[i] + 0;

    System.out.println(j+"° - "+b[j]+" - Par");
    j++; 

    } 
   }

   if (j<20) {

    for(i= 0; i<20; i++) {


    if (a[i] % 2 == 1) {
    b[j] = a[i] + 0;

    System.out.println(j+"° - "+b[j]+" - Impar");         
    j++;         

    } 


    }    

   }    
   in.close();
   }    
