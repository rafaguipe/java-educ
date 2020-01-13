
public class Rampa4{
  public static void main(String args[]) {
    for(int i = 0; i < 10; i++){
      for(int espacos = 0; espacos < i; espacos++){
        System.out.print("  ");
      }
      for(int j = 0; j < 10 - i; j++){
        
        System.out.print(j + " ");
      }
      System.out.println();
    }
      
  }
}