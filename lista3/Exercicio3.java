
/*
Rafael GP
21-Jan-2020

Lista 3
3. Dado x inteiro e n natural, faça um programa que calcula x^n.

*/

import static java.lang.Math.pow;

public class Exercicio3{

	public static void main(String args[]){

		int v[] = new int[args.length];
		

		try{
			for(int i=0;i<args.length;i++){
				v[i] = Integer.parseInt(args[i]);
				
				//if(args.length != 2){
				//	System.out.println("ERRO: numero de argumentos diferente de 2");
				//	break;
				//}
				//if(v[1]< 0){
				//	System.out.println("ERRO: o segundo argumento não eh numero NATURAL");
				//	break;	
				//}
			}
		}
		catch(java.lang.ArrayIndexOutOfBoundsException excep){
			System.out.println("ERRO: numero de argumentos diferente de 2");
		}

		System.out.println(potencia(v));
	}

	public static double potencia(int[] v){
		int x = v[0];
		int y = v[1];
		return Math.pow(x,y);	
	}

	
}