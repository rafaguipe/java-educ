/*
Rafael GP - 8.1.2020

QUESTAO: Escreva uma função que imprime a seguinte saída: 
9876543210
987654321
98765432
9876543
987654 
98765 
9876 
987
98 
9

Na implementação função use dois laços aninhados (um dentro do outro), note que o laço mais externo repete 10 vezes e o 
laço mais interno não repete um número fixo de vezes, abaixo a declaração da função:

void imprime(){...}

*/

public class Rampa{


	public static void main(String args[]){
		imprime();
	}

	public static void imprime(){

		for(int i=0;i<10;i++){
			for(int j=9;j>i-1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		System.out.println();
	}


}