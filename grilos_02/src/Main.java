import java.util.Scanner;

public class Main {
	
	public static int[] tPulo = new int[2];
	
	static int posicao = 0;
	static int disMax; 
	
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Quantos grilos deseja? ");
	    int Qgrilos = scanner.nextInt();
	    Qgrilos += 1;
	    System.out.print("Qual Distancia da linha de chegada? ");
	    disMax = scanner.nextInt();
	
	    Grilo g = new Grilo(Qgrilos);
	    
	    
	    for(int i = 1; i<Qgrilos; i++) {
	    	
	    	System.out.println("Grilo_"+(i+1)+" do time: "+g.Time+" foi o "+g.Colocacao+"º colocado com "+g.Pulos+" pulos");
	          
            if(g.Time==1){
                
                 tPulo[0] += g.Pulos;  
                  System.out.println(" total de "+tPulo[0]+" pulos do time: "+g.Time); 
            }
            if(g.Time==2){
                
                 tPulo[1] += g.Pulos;  
                   System.out.println(" total de "+tPulo[1]+" pulos do time: "+g.Time); 
            }
            
            if(g.Colocacao ==1 ){
        
                System.out.println("O time: "+g.Time+" venceu");
                
            }
	    }
		
	
	
	
	
	if (posicao == Qgrilos) {
		
		System.out.println("Todos chegaram");
		
	
	}
	
	}
   
}