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

*/

public class Imprime1{


 public static void main(String args[]){

  for(int i=0;i<10;i++){
    //System.out.println();
    
    for (int j=0;j<10;j++){
    System.out.print(j+" ");
   }
   System.out.println();

  }


 }

}