/*
Rafael GP - 8.1.2020

---

QUESTAO: Escreva uma função ehCrescente() que recebe um vetor de número inteiros, e verifica se os elementos do vetor estão em ordem crescente, função retorna true caso os elementos estejam em ordem crescente e false caso contrário. Abaixo a declaração da função:
boolean ehCrescente( int V[]){...}
*/

public class Crescente{

	public static void main(String args[]){
		int v[] = new int[args.length]; //{1,2,2,4,5};
		for(int i=0;i<args.length;i++){
			v[i] = Integer.parseInt(args[i]);
		}

		boolean resposta = ehCrescente(v);
		System.out.println(resposta);
	}

	public static boolean ehCrescente(int V[]){
		int tamanho_vetor = V.length;
		System.out.println("tamanho do vetor: "+tamanho_vetor);
		for(int i=0;i<tamanho_vetor-1;i++){
			if (V[i+1]<V[i]){
				System.out.println("NAO eh crescente");
				return false;
			}
		}
		System.out.println("eh crescente");
		return true;
	}
}