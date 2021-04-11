public class Grilo extends Thread {
		 
		int pulos;
		int distAtual;
		int lugar = 0;
		int id;
		int lap;
		
		public Grilo (int id) {
			this.id = id;
			
			
		}
		
		
		public void run() {
			
				
			
				while(distAtual < Main.disMax) {
				int distpulo = (int) (Math.random()* 100.0);
				distAtual = distAtual + distpulo;
				System.out.println("O Grilo " + id + " pulou " + distpulo + " e ja percorreu " + distAtual);
				pulos ++;
				distpulo = 0;
				
				
				//Colocamos um if antes do try/catch para evitar um "pulo adicional" ates de dizer que chegou
				if(distAtual >= Main.disMax) {
					   System.out.println("O Grilo "+id+" alcançou a linha de chegada com " + pulos + " pulos.");
				   }
				
				
			   try {
					sleep(100 + (int)(Math.random() * 100.0));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  
			   
				
				}
			
				Main.posicao++;
				
				//Aqui era onde ficava o codigo anteriormente que fazia o grilo ter que dar mais um pulo após chegar
				
				//System.out.println("O Grilo "+id+" alcançou a linha de chegada com " + pulos + " pulos.");  
				
				
				
		}
		
	}	


