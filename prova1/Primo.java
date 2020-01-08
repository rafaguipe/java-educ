/*
Rafael GP - 8.1.2020

Consultas: 
[1] https://www.pythonprogressivo.net/2018/06/Primos-Python-Como-Saber-Numero-e-Primo.html
[2] https://www.alura.com.br/artigos/para-que-serve-o-string-args-em-java

Um número é dito primo quando é possível dividir ele (divisão de inteiro com inteiro) por 1 e por ele mesmo.

Exemplos de números primos:
2, 3, 5, 7,  11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 
113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 
241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373 ...

---

QUESTAO: Escreva uma função que receba por parâmetro um N número natural maior que 1 (não precisa testar, sempre será informado um número > 1), e verifica se o mesmo é primo ou não. Caso o número seja primo é retornado true e caso contrário false, lembre-se que um número primo é divisível somente por 1 e por ele mesmo. Abaixo a declaração da função:
boolean ehPrimo(int N){...}
*/


public class Primo{


	public static void main(String args[]){

		int x = Integer.parseInt(args[0]);
		ehPrimo(x);
		//ehPrimo(12);
		//ehPrimo(8);
	}

	public static boolean ehPrimo(int N){
		int aux = 0;
		System.out.print("\n\nAnalise de: "+N+"\n");
		for(int i=2;i<N;i++){
			if(N % i == 0){
				aux ++;
				System.out.println(N+" eh divisivel por "+i);
				//return true;
			}
		}
		System.out.println("multiplos: " + aux);
		if(aux==0){
			System.out.println(N+" eh primo: ");
			return true;
		}
		else {
			System.out.println(N+" NAO eh primo: ");
			return false;
		}
		
	}

}