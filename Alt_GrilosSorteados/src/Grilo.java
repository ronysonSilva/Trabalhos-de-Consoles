public class Grilo extends Thread {
 
	int pulos;
	int distMax;
	int distAtual;
	int id;
	
	public Grilo (int id, int distMaxima) {
		this.id = id;
		distMax = distMaxima;
	}
	
	
	public void run() {
		
		
		while(distAtual < distMax) {
		int distpulo = (int) (Math.random()* 100.0); //Sorteia a distância do pulo.
		distAtual = distAtual + distpulo;
		System.out.println("O Grilo " + id + " pulou " + distpulo + " e ja percorreu " + distAtual);
		pulos ++;
		distpulo = 0;
			
			
		try {
				sleep(100 + (int)(Math.random() * 100.0));
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			  
		  
			
		}
		
		System.out.println("O Grilo "+id+" alcançou a linha de chegada com "+ pulos + " pulos.");
		
			
			
			
	}
	
}	

