/*

Rafael GP - 12.1.2020

5. Escreva um programa para imprimir o seguinte
123456789 2 4 6 81012141618 3 6 9121518212427 4 812162024283236 5 10 15 20 25 30 35 40 45 6 12 18 24 30 36 42 48 54 7 14 21 28 35 42 49 56 63 8 16 24 32 40 48 56 64 72 9 18 27 36 45 54 63 72 81


*/

public class Imprime5{


	public static void main(String args[]){

		int j = 0;

		for(int i=1;i<10;i++){
			for (j=1;j<10;j++){
				System.out.print(i*j+"\t");
			}
			System.out.println();

		}



	}

}