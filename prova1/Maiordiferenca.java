
/*
Rafael GP - 8.1.2020

---

QUESTAO: Escreva uma função que receba um vetor como parâmetro, a sua função calcula e retorna a maior diferença absoluta entre números armazenados no vetor. Abaixo a declaração da função:
int maiorABS(int V[]){...}

*/

public class Maiordiferenca{

	public static void main(String args[]){

		int v[] = new int[args.length]; //{1,2,2,4,5};
		for(int i=0;i<args.length;i++){
			v[i] = Integer.parseInt(args[i]);
		}
	
	int dif = maiorABS(v);
	System.out.println("Marior diferenca absoluta: "+dif);

	}

	public static int maiorABS(int v[]){
		int min = v[0];
		int max = v[0];
		
		for(int i=0;i<v.length;i++){
			if(v[i]>max){
				max = v[i];
			}
			else
			if(v[i]<min){
				min = v[i];
			}

		}
		return max-min;
	}

}