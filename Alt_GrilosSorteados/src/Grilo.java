import java.util.Random;

public class Grilo extends Thread {
 
	private int pulos, distAtual, id, time, total;
	int finalg, iniciog;
	
	public Grilo (int id, int time) {
		this.id = id;
		this.time = time;
	}
	
	
	
	public void run() {
		
		Random randomizer = new Random();
		
		while(distAtual < Main.distMax) { //enquanto a distancia atual for menor que a dist�ncia M�xima
		int distpulo = randomizer.nextInt(20) + 10; //Sorteia a dist�ncia do pulo.
		distAtual = distAtual +distpulo;
		System.out.println("O Grilo " + id + " pulou " + distpulo + " e ja percorreu " + distAtual);
		pulos ++;
		total = Main.grilototal; //pega a quantidade de grilos totais.
				 
		if(distAtual >= Main.distMax) {
			
			Main.chegada++;
			
			
			if(Main.chegada == 2) {
				Main.winTime = time;
			}

			for(int i = 1 ; i < Main.totaltimes ; i++) {
				if(i == this.time) {
					Main.distTotal[i] = distAtual;
				}
			}
			

			
			System.out.println("O Grilo "+id+ " do time "+time+" alcan�ou a linha de chegada com "+ pulos + " pulos.");
			
			System.out.println("Ele chegou em " +(Main.chegada - 1)+ "� lugar!");
			System.out.println(" ");
			
		}	
			
		try {
				sleep(100 + (int)(Math.random() * 100.0));
		} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			  		
		
	}
		
	
		
		if(Main.chegada == total) { 
			if (distAtual >= Main.distMax && Main.finalizou == false) {	
				System.out.println("O time vencedor � o time "+ Main.winTime);
				
				Main.finalizou = true;
				
				for(int i = 1 ; i < Main.totaltimes ; i++) {
					System.out.println("O time "+ i +" alcan�ou a dist�ncia total de "+ Main.distTotal[i]);
				}
				
				
			}
	    }
		
		
	}
	
	
}	

