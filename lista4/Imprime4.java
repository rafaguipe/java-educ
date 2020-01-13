/*

Rafael GP - 12.1.2020

Escreva um programa para imprimir o seguinte:
0123456789
 012345678 
  01234567
   0123456
    012345
     01234
      0123
       012
        01
         0

*/

public class Imprime4{


	public static void main(String args[]){

		for(int i=0;i<10;i++){
			for(int k=0;k<i;k++){
				System.out.print("  ");
			}

			for (int j=0;j<10-i;j++){
				System.out.print(j+" ");
			}
			System.out.println();

		}



	}

}