/* Rafael GP - 8.1.2020

QUESTAO: Faça uma função que receba 3 números inteiros representando o comprimento das arestas de um triângulo, a sua função verifica se os valores lidos podem formar um triangulo e retorna true caso seja possível ou false caso contrário.
public static Boolean ehTriangulo( int A, int B, int C){...}

Regras para verificar se os lados formam um triangulo:
https://mundoeducacao.bol.uol.com.br/matematica/condicao-existencia-um-triangulo.htm

| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b

*/


public class Triangulo{

	//funcao que verifica se eh triangulo
	

	public static void main(String args[]){
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);

		boolean resposta = ehTriangulo(x,y,z);
		System.out.println(resposta);

	}

	

	public static Boolean ehTriangulo( int A, int B, int C){
	
		boolean a,b,c;

		if(A > java.lang.Math.abs(B-C) && A < (B+C)){
			a = true;
			System.out.println("OK A");
		}
		else{
			a = false;
			System.out.println("NOK A");
		}
			
		if(B > java.lang.Math.abs(A-C) && B < (A+C)){
			b = true;
			System.out.println("OK B");
		}
		else{
			b = false;
			System.out.println("NOK B");
		}
			
		if (C > java.lang.Math.abs(A-B) && C < (A+B)){
			c = true;
			System.out.println("OK C");
		}
		else{
			c = false;
			System.out.println("NOK C");

		}


		return a && b && c;


	}

}

/*
//Método bem direto

if(A > java.lang.Math.abs(B-C) && A < (B+C)){
			if(B > java.lang.Math.abs(A-C) && B < (A+C)){
				if (C > java.lang.Math.abs(A-B) && C < (A+B)){
					return true;
				}
			}
		}

		return false;
*/
