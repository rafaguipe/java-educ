

import java.util.Scanner;
import static java.lang.Math.pow;

public class Exercicio9{

	public static void main(String args[]){

    	int vet[] = new int [3];
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro numero:");
        vet[0] = ler.nextInt();
        System.out.print("Digite o segundo numero:");
        vet[1] = ler.nextInt();
        System.out.print("Digite o terceiro numero:");
        vet[2] = ler.nextInt();
    	int maior = 0;


    	double a = Math.pow(vet[0],2);
    	double b = Math.pow(vet[1],2);
    	double c = Math.pow(vet[2],2);

        if(vet [0] > vet [1]){
           
           if(vet[0] > vet[2] ){
           		if(a==b+c){
           		System.out.println("É uma tripla de pitágoras");
           		}

           }
            

    	}else
    	if(vet[1] > vet[2]){
    		if(b == a+c){
    			System.out.println("É uma tripla de pitágoras");

    		}
    		else
    			System.out.println("NAO É uma tripla de pitágoras");
    	}
    	else
    	if(c==a+b){
    	  	System.out.println("É uma tripla de pitágoras");

    	}
    	else{
    		System.out.println("Nao é uma tripla de pitágoras");
    	}


	}
}