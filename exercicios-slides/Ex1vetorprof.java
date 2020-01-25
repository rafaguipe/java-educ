import java.util.Scanner;
	public class Ex1vetorprof{
	  	public static void main(String args[]){
		    Scanner entrada = new Scanner (System.in);
		    float media;
		    float somavet = 0;
		    int contador = 0;
		    System.out.print("digite o tamanho do vetor:");
		    int tamanho = entrada.nextInt();
		    
		    int v[] = new int [tamanho];
		    for(int i = 0; i < tamanho; i++){
		      v[i] = entrada.nextInt();
		      
		    }
		    for(int i = 0; i < tamanho; i++){
		      somavet = somavet + v[i];
		      System.out.print("  " +somavet);
		      
		    }
		    media = somavet / tamanho;
		    System.out.print(" A media é " + media);
		    
		    for(int i = 0; i < tamanho; i++){
		      if(v[i] > media){
		        contador++;
		        System.out.println(contador);
		      }
		    }
		    System.out.println(contador);
		}
	}
  

 