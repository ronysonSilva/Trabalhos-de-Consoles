import java.util.Random;

public class Main {
	
	static int distMax;
	static int grilototal, winTime, winGrilo, chegada, totaltimes;
	static int time = 1;
	static int distTotal[];
	static boolean finalizou = false;
	
	
	public static void main(String[] args) {
		
		Random gerador = new Random();
		
		grilototal = gerador.nextInt(30)+1;
		
		distMax = gerador.nextInt(300);
		
		System.out.println("A dist�ncia m�xima � " + distMax);//Avisa a dist�ncia m�xima
		
		System.out.println("Tem " + grilototal + " grilos!"); //Avisa quantos grilos tem.
		
		
		grilototal ++;
		chegada ++;
		
		totaltimes = grilototal/3;
		
		System.out.println("Tem " + totaltimes + " times!");
		
		distTotal = new int[totaltimes];
		
		
		Grilo [] gA = new Grilo[grilototal];

		 for(int count = 1; count< gA.length; count++) {
			
			if(count % 3 == 0) {
				time++;
			}
			gA[count] = new Grilo (count, time);
			
		 gA[count].start();
		
		}
		 
		
		 
		
		
		
	}
   
}
