import java.util.Scanner; 
public class Exercicio9{ 
   public static void main(String[] args) { 
       Scanner in = new Scanner(System.in); 
        
       int j, i, s, ai, bf, a[], b[], c[];  
        
       a = new int[10]; 
       b = new int[10]; 
       c = new int[10]; 
        
       j= 0;  
        
       for(i=0; i<10; i++) { 
           s = i+ 1; 
            
           System.out.println("Digite aqui por favor "+s+"° valor do elemento do vetor A"); 
           a[i] = in.nextInt(); 
            
           System.out.println("Digite aqui por favor o "+s+"° valor do elemento do vetor B"); 
           b[i] = in.nextInt(); 
            
           System.out.println(" "); 
       } 
        
       for (ai=0; ai<10; ai++) { 
            
           for(bf=0; bf<10; bf++) { 
                
               if(a[ai] == b[bf]) { 
                    
                   c[j] = a[ai]; 
                   j++;  
                    
                   break;  
               } 
           } 
       } 
        
       System.out.println("\n--- Inserindo Vetor C---"); 
        
       if (j == 0) { 
           System.out.println("Nenhum elemento em comum encontrado aqui!"); 
       } else { 
 
        for (ai=0; ai < j; ai++) {  
               s = ai + 1; 
               System.out.println("O valor do "+s+"º elemento do vetor C é: "+c[ai]); 
           } 
       } 
        
      in.close(); 
   } 
} 
