import java.util.Scanner;



public class intersecvet{
	public static void main(String args[]){
		int A[] = new int [4];
		int B[] = new int [4];
  		Scanner entrada = new Scanner(System.in);
  		String resultado = "";
  		
  		for(int cont = 0; cont < 4; cont++){
  			System.out.println("Digite o "+cont+" de A" );
  			A[cont] = entrada.nextInt();

  		}
	    for(int cont = 0; cont < 4; cont++){
  			System.out.println("Digite o "+cont+" de B" );
  			B[cont] = entrada.nextInt();
	    }

	    for(int contA = 0; contA < 4; contA++){
	    	for(int contB = 0; contB < 4; contB++ ){
	    		if(A[contA] == B[contB]){
                   resultado = resultado + A[contA];
				   System.out.println("bla"+ resultado);
				   resultado = entrada.nextString();

	    		}
	    	}

	    }

	}
}