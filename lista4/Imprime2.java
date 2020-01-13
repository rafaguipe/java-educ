/*

Rafael GP - 12.1.2020

1. Escreva um programa para imprimir o seguinte:
0123456789 
0123456789 
0123456789 
0123456789 
0123456789 
0123456789 
0123456789 
0123456789 
0123456789 
0123456789

Use dois laços aninhados, ou seja, imprima a primeira linha com o laço, e não com: System.out.println("0 1 2 3 4 5 6 7 8 9")


2. Ajuste o programa anterior para imprimir:
0000000000 1111111111 2222222222 3333333333 4444444444 5555555555 6666666666 7777777777 8888888888 9999999999

*/

public class Imprime2{


 public static void main(String args[]){

  for(int i=0;i<10;i++){
   for (int j=0;j<10;j++){
    System.out.print(i+" ");
   }
   System.out.println();

  }


 }

}