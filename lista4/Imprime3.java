/*

Rafael GP - 12.1.2020

3. Escreva um programa que imprima o seguinte:
0
01
012
0123
01234 
012345 
0123456 
01234567 
012345678 
0123456789

Dica: Isto é o mesmo que o exercício 4, mas o laço (loop) de dentro não repete um número fixo de vezes.

*/

public class Imprime3{


 public static void main(String args[]){

  for(int i=0;i<10;i++){
   for (int j=0;j<i+1;j++){
    System.out.print(j+" ");
   }
   System.out.println();

  }



 }

}