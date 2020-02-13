/* Rafael Guimaraes Pereira
2-Fev-2020 @ 21h37
São Paulo / BR

Jogo 'Simon' para repetir sequencias musicais
*/

package dtmf;

import java.util.Scanner; 
import java.util.Random;
import java.util.*; //list
import java.util.Random;
import java.lang.*;


public class Simon{

	public static void main(String args[]){
		AudioClip toneZero;
		toneZero  = getAudioClip(getCodeBase(), "zero.au");

		int rodada = 1;
		int tamanho; //tamanho da sequencia
		//cria a sequencia de sons que vai ser acrescido de 1 a cada rodada
		List sequencia = new ArrayList();
		List resposta = new ArrayList();


		TelaInicial();

		while(rodada<10){
			tamanho = AddValor(sequencia);
			MostraSequencia(sequencia);
			resposta = LeRespostaUsuario(tamanho);//informa o tamanho, quantas respostas esperar
			if(Compara(sequencia,resposta)==false){
				Finaliza(sequencia, resposta);
				break;
			}
			rodada++;
		}
	}


	public static int AddValor(List lista){
		//cria o objeto para numero randomico
		Random rand = new Random();

		lista.add(rand.nextInt(4)+1);
		System.out.println(lista);
		return lista.size(); // retorna com o tamanho da sequencia
	}

	public static List LeRespostaUsuario(int tamanho){
		Scanner entrada = new Scanner(System.in);
		List aux = new ArrayList();
		for(int i=0;i<tamanho;i++){
			aux.add(entrada.nextInt());
		}
		return aux;
	}

	public static boolean Compara(List seq, List resp){
		//System.out.println("compara");
		int n = seq.size();
		for(int i=0;i<n;i++){
			if(seq.get(i) != resp.get(i)){
				return false;
			} 
		}
		return true;
	}

	public static void TelaInicial(){
		ApagaTela();
		//imprime o seguinte:
		System.out.println("=========================");
		System.out.println("Jogo Simon");
		System.out.println("v. 2020-02-02");
		System.out.println("Repita a sequencia");
		System.out.println("");
		System.out.println("(RGP)");
		System.out.println("=========================");
		System.out.println("");
	}

	public static void Finaliza(List sequencia, List resposta){
		Beep();
		System.out.println("GAME OVER");
		System.out.println("sequencia"+ sequencia);
		System.out.println("resposta"+ resposta);
		
	}

	public static void Beep(){
		//beep
		System.out.print("\007");
	}
	
	public static void ApagaTela(){
		//apaga tela
		System.out.print("\033\143");
	}

	public static void MostraSequencia(List sequencia){
		ApagaTela();
		int n = sequencia.size();
		for(int i=0;i<n;i++){
			System.out.print(sequencia.get(i));
			Pause(1000);
			ApagaTela();
			System.out.print("-");
			Pause(500);
			ApagaTela();
		}
	}
	
	public static void Pause(int tempo){
		try{
			Thread.sleep(tempo);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


