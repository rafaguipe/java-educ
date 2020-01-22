/*
Rafael GP
21-Jan-2020

Lista 3
2. Escreva um programa que leia uma seqüência de números inteiros e positivos, 
encontre e imprima o maior e o menor número. 
A entrada de um número negativo indica que seqüência terminou.


*/

import java.util.Arrays;

public class Exercicio2{

	public static void main(String args[]){

		int v[] = new int[args.length];
		

		for(int i=0;i<args.length;i++){
			v[i] = Integer.parseInt(args[i]);
			if(v[i]<0){
				System.out.println("erro: numero negativo presente!");
			}
		}



		System.out.println(Arrays.toString(estatisticas(v)));
	}

	public static float[] estatisticas(int[] v){
		int[] A = v; //{1,2,3,4,5};
		//float[] B = {0};
		int comprimento_v = A.length;

		//if(comprimento_v != 5){
		//	return B;
		//}

		float min=A[0];
		float max=A[0];
		float soma = 0;
		for(int i=0;i<comprimento_v;i++){
			//if(A[i]<0){
			//	System.out.println("Nao pode haver numero negativo");
			//	float[] C = {0};
			//	return C;
			//}
			if(A[i]<min){
				min = A[i];
			}
			if(A[i]>max){
				max = A[i];
			}
			soma = soma + A[i];
		}
		float media = soma / comprimento_v;
		System.out.println("maior, menor, media_aritmetica");
		float[] C = {max, min, media};
		return C;		
	}

	
}