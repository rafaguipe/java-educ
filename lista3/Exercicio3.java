
/*
Rafael GP
21-Jan-2020

Lista 3
3. Dado x inteiro e n natural, faça um programa que calcula x^n.

*/

//import static java.lang.Math.pow;

public class Exercicio3{

	public static void main(String args[]){

		int v[] = new int[args.length];
		

		for(int i=0;i<args.length;i++){
			v[i] = Integer.parseInt(args[i]);
			
			if(args.length>1){
				System.out.println("ERRO: numero de argumentos > 1");
				break;
			}
		}

		System.out.println(potencia(v[0]));
	}

	public static int potencia(int v){
		
		return v*v; //pow(v,2);		
	}

	
}