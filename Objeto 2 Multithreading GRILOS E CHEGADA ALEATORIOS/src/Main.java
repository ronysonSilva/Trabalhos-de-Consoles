
public class Main {
	
	static int distMax;
	static int grilototal;
	
	public static void main(String[] args) {
		
		while((grilototal>30)||(grilototal<5)){ //Resorteia o numero total de grilos at� ter mais de 5 grilos e menos de 30 grilos.
			grilototal = (int) (Math.random()* 100.0); // Sorteia o numero de grilos.
			
		}
		
		while (distMax<10) { // Resorteia a dist�ncia m�xima caso a dist�ncia m�xima seja menor do que 10.
			distMax = (int) (Math.random()* 100.0);
		}		
		
		System.out.println("A dist�ncia m�xima � " + distMax);//Avisa a dist�ncia m�xima
		
		System.out.println("Tem " + grilototal + " grilos!"); //Avisa quantos grilos tem.
		
		Grilo [] gA = new Grilo[grilototal];
	
		for(int count = 1; count< grilototal; count++) {
		 gA[count] = new Grilo (count, distMax);
		 gA[count].start();
		}
		
	}
   
}
