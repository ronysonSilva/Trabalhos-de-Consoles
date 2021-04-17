import java.util.Scanner;

public class Main {
	
	static int posicao, gg, totalpulos1, totalpulos2, totaldist1, totaldist2, timeW = 0;
	static int disMax; 
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Quantos grilos deseja? ");
	    int Qgrilos = scanner.nextInt();
	    while(Qgrilos > 30) {
	    	System.out.print("30 é o limite! Digite novamente...");
	    	Qgrilos = scanner.nextInt();
	    }
	    
	    gg = Qgrilos + 1;
	    posicao +=1;
	    System.out.print("Qual Distancia da linha de chegada? ");
	    disMax = scanner.nextInt();
	
	     Grilo []g = new Grilo[Qgrilos];
	    
	    for(int i = 1; i<Qgrilos; i++) { //decide de qual time pertence cada grilo pertence
	    	
	    	g[i] = new Grilo (i);
	    	g[i].start();
	      
			
		if(i % 2 != 0) {
			gA[i] = new Grilo (i, 1);
		}else if(count % 2 == 0) {
			gA[i] = new Grilo (i, 2);
		}
			
		 gA[i].start();//inicia os grilos
		 
		}
		
	
	
	
	
	if (posicao == Qgrilos) {
		
		System.out.println("Todos chegaram");
		
	
	}
	
	}
   
}
