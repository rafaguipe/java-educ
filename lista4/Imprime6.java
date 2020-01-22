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

		for(int i=0;i<10;i++){
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

		}



	}

}