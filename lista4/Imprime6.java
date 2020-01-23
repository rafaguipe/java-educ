/*

Rafael GP - 12.1.2020

6. Escreva um programa para imprimir isso:
1
121
12321 1234321 123454321 12345654321 1234567654321 123456787654321
    1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1.

*/

public class Imprime6{


	public static void main(String args[]){
		// i: nova linha. Vai de 1 ateh 8 (<9)
		for(int i=1;i<9;i++){
			// j: espaço em branco. Vai de 1 ateh 
			for (int j=1;j<9-i;j++){
			// imprimi hifem para fins didativos somente. Para o exercicio se imprime espaço em branco.
				System.out.print("--");
			}
			// k: numero, triangulo da esquerda /|
			for (int k=1;k<i+1;k++){
				System.out.print(k + " ");
			}
			// l: numero, triangulo da direita |\
			for (int l=i-1;l>0;l--){
				System.out.print(l + " ");
			}
			//nova linha do loop de 'i'
			System.out.println();

		}



	}

}

/*
for(int i=0;i<11;i++){
			// j: espaço em branco
			for (int j=1;j<11-i;j++){
				System.out.print("  ");
			}
			for (int k=1;k<i;k++){
				System.out.print(k + " ");
			}
			for (int l=i-2;l>0;l--){
				System.out.print(l + " ");
			}
			System.out.println();

*/
