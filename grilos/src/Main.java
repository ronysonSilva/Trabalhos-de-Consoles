import java.util.Scanner;

public class Main {
	
	static int posicao = 0;
	static int disMax; 
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Quantos grilos deseja? ");
	    int Qgrilos = scanner.nextInt();
	    Qgrilos += 1;
	    System.out.print("Qual Distancia da linha de chegada? ");
	    disMax = scanner.nextInt();
	
	    Grilo []g = new Grilo[Qgrilos];
	    
	    for(int i = 1; i<Qgrilos; i++) {
	    	
	    	g[i] = new Grilo (i);
	    	g[i].start();
	    }
		
	
	
	
	
	if (posicao == Qgrilos) {
		
		System.out.println("Todos chegaram");
		
	
	}
	
	}
   
}
