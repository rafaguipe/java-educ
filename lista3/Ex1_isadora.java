



import java.util.Scanner;

public class Ex1_isadora{

	public static void main(String args[]){


		Scanner get = new Scanner(System.in);
		double maior = 0, menor = 10, N, soma=0;
		int count =0;

		while(count < 5){
			N = get.nextDouble();
			if(N<menor){
				menor = N;
			}
			if(N>maior){
				maior = N;
			}
			count++;
			soma = soma + N;
		}
		System.out.println("menor:"+menor);
		System.out.println("maior:"+maior);
		System.out.println("media:"+soma/5);


	}
}