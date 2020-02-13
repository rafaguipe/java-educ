/* Rafael Guimaraes Pereira
1-Fev-2020 @ 21h37
São Paulo / BR

Jogo de Senhas
São 4 algarismos de 1 a 6.
*/

import java.util.Scanner; 
import java.util.Random;

public class Senhas{

	public static void main(String args[]){
		int MAX_RODADAS = 10;
		int rodadas = 0;

		//instrucoes para o jogo
		instrucoes();

		//caracteres especiais
		//char tudo_certo = (char) 895;
		//char meio_certo = (char) 42;
		String tudo_certo = "=";
		String meio_certo = "*";

		//numero de numeros da senha
		int tamanho = 4;

		Scanner entrada = new Scanner(System.in);
		//vetor que irah armazenar o password
		int P[] = new int [tamanho];
		//vetor que armazena a Answer do usuario
		int A[] = new int [tamanho];
		//cria o objeto para numero randomico
		Random rand = new Random();
		//gera numeros aleatorios para a senha
		//garante que nao se repitam
		for(int i=0;i<tamanho;i++){
			P[i] = rand.nextInt(6);
			int j;
			for(j=0;j<tamanho;j++){
				if(P[i]==P[j] && j != i){
					P[i] = rand.nextInt(6);
					j = -1;
				}
			}
			//System.out.print(P[i]+"  ");
		}
		
//=============
		while(rodadas<MAX_RODADAS){
			//pergunta ao jogador a resposta
			System.out.println();
			for(int i=0;i<tamanho;i++){
				A[i] = entrada.nextInt();
				
			}

			//checa se tem valor+posicao identicos
			int cont_tudo_certo = 0;
			int cont_meio_certo = 0;

			for(int i=0;i<tamanho;i++){
				if(A[i]==P[i]){
					//System.out.print(tudo_certo+" ");
					cont_tudo_certo++;
				}
				for(int j=0;j<tamanho;j++){
					if(A[i]==P[j] && j != i){
						//System.out.print(meio_certo+" ");
						cont_meio_certo++;
					}
				}
			}
			//System.out.print("tudo certo:"+cont_tudo_certo);
			//System.out.print(" - meio certo:"+cont_meio_certo);
			for(int i=0;i<cont_tudo_certo;i++){
				System.out.print(tudo_certo+" ");
			}
			for(int i=0;i<cont_meio_certo;i++){
				System.out.print(meio_certo+" ");
			}

			if(cont_tudo_certo==tamanho){
				System.out.println("\nParabéns, você adivinhou a senha!\n");
				break;
			}
			if(rodadas>MAX_RODADAS){
				
			}
			rodadas++;

		}
		imprime_final(rodadas, tamanho, P);
//=============

	}

	public static void instrucoes(){
		System.out.println("=========================");
		System.out.println("Digite numeros de 1 a 6");
		System.out.println("Ex: 1 2 3 4");
		System.out.println("");
		System.out.println("=: numero e posicao ok");
		System.out.println("*: numero ok, posicao nok");
		System.out.println("=========================");
		System.out.println("");
		//for(int i=0;i<3000;i++){
		//	char aux = (char) i;
		//	System.out.print(" "+i+":"+aux);
		//}
	}
	public static void imprime_final(int rodadas, int tamanho, int P[]){
		System.out.println("Rodadas: "+rodadas);
		System.out.println("GAME OVER");
		System.out.print("Password: ");
			for(int i=0;i<tamanho;i++){
				System.out.print(P[i]+ " ");
			}
		System.out.println();
	}
}


