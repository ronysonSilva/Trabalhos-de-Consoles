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
		
		while(distAtual < Main.distMax) { //enquanto a distancia atual for menor que a distância Máxima
		int distpulo = randomizer.nextInt(20) + 10; //Sorteia a distância do pulo.
		distAtual = distAtual +distpulo;
		System.out.println("O Grilo " + id + " pulou " + distpulo + " e ja percorreu " + distAtual);
		pulos ++;
		total = Main.grilototal; //pega a quantidade de grilos totais.
				 
		if(distAtual >= Main.distMax) {
			
			Main.chegada++;
			
			
			if(Main.chegada == 2) {
				Main.winTime = time;
			}
			
			/*if(this.time == 1) {
				   
				 Main.distTotal[1] += distAtual;
			   }
			   else {
				   Main.distTotal[2] += distAtual;
			   }*/
			
			switch(this.time) {
			case 0:
				Main.distTotal[0] =+ distAtual;
				break;
			case 1:
				Main.distTotal[1] =+ distAtual;
				break;
			case 2:
				Main.distTotal[2] =+ distAtual;
				break;
			case 3:
				Main.distTotal[3] =+ distAtual;
				break;
			case 4:
				Main.distTotal[4] =+ distAtual;
				break;
			case 5:
				Main.distTotal[5] =+ distAtual;
				break;
			case 6:
				Main.distTotal[6] =+ distAtual;
				break;
			case 7:
				Main.distTotal[7] =+ distAtual;
				break;
			case 8: 
				Main.distTotal[8] =+ distAtual;
				break;
			case 9:
				Main.distTotal[9] =+ distAtual;
				break;
			}
			
			System.out.println("O Grilo "+id+ " do time "+time+" alcançou a linha de chegada com "+ pulos + " pulos.");
			
			System.out.println("Ele chegou em " +(Main.chegada - 1)+ "º lugar!");
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
			if (distAtual >= Main.distMax) {	
				System.out.println("O time vencedor é o time "+ Main.winTime);
			}
	    }
		
		
	}
	
	
}	

