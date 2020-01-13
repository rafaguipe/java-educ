/*

Rafael GP - 13.1.2020

7. Escreva um programa que imprime isso:
                1
              1 2 1
            1 2 3 2 1 
          1 2 3 4 3 2 1 
        1 2 3 4 5 4 3 2 1 
      1 2 3 4 5 6 5 4 3 2 1 
    1 2 3 4 5 6 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
  1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
    1 2 3 4 5 6 7 6 5 4 3 2 1 
      1 2 3 4 5 6 5 4 3 2 1 
        1 2 3 4 5 4 3 2 1 
          1 2 3 4 3 2 1 
            1 2 3 2 1
              1 2 1
                1

*/

public class Imprime7{


	public static void main(String args[]){

		for(int i=0;i<11;i++){
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

		for(int i=1;i<11;i++){
			for (int j=0;j<i;j++){
				System.out.print("  ");
			}
			for (int k=1;k<10-i;k++){
				System.out.print(k + " ");
			}
			for (int l=8-i;l>0;l--){
				System.out.print(l + " ");
			}
			System.out.println();
		}

	}
}