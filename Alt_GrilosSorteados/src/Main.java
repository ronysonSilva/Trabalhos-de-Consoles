import java.util.Random;

public class Main {
	
	static int distMax;
	static int grilototal, winTime, winGrilo, chegada;
	static int time = 1;
	static int distTotal[] = new int[10];
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		grilototal = gerador.nextInt(30);
		
		distMax = gerador.nextInt(300);
		
		System.out.println("A distância máxima é " + distMax);//Avisa a distância máxima
		
		System.out.println("Tem " + grilototal + " grilos!"); //Avisa quantos grilos tem.
		
		
		grilototal ++;
		chegada ++;
		
		
		Grilo [] gA = new Grilo[grilototal];

		 for(int count = 1; count< grilototal; count++) {
			
			if(count % 3 == 0) {
				time++;
			}
			gA[count] = new Grilo (count, time);
			
		 gA[count].start();
		}
		
		 
		
		
		
	}
   
}
