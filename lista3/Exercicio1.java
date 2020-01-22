/*
Rafael GP
13-Jan-2020

Lista 3
1. Escreva um programa que leia 5 valores inteiros e positivos e, encontre o maior valor, o menor valor 
e calcule a média aritmética dos números lidos.


*/

import java.util.Arrays;

public class Exercicio1{

	public static void main(String args[]){

		//cria um vetor VAZIO com length posicoes
		int v[] = new int[args.length];
		
		if (args.length != 5){
			System.out.println("Numero de argumentos != 5!");
		}

		//coloca os valores em cada local vazio jah criado
		for(int i=0;i<args.length;i++){
			v[i] = Integer.parseInt(args[i]);
		}


		System.out.println(Arrays.toString(estatisticas(v)));
	}

	public static float[] estatisticas(int[] v){
		int[] A = v; //{1,2,3,4,5};
		float[] B = {0};
		int comprimento_v = A.length;

		if(comprimento_v != 5){
			return B;
		}

		float min=A[0];
		float max=A[0];
		float soma = 0;
		for(int i=0;i<comprimento_v;i++){
			if(A[i]<0){
				System.out.println("Nao pode haver numero negativo");
				return B;
			}
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