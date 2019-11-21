import java.util.Scanner;
public class Metodo1 {

	public static void main (String[] args) {
		 Scanner ler = new Scanner (System.in);
		double investimento;
		int meses;
		
		System.out.println("Digite o valor investido");
		 investimento = ler.nextDouble();
		System.out.println("Digite o número de meses");
		 meses = ler.nextInt();
		System.out.println(investir (investimento,meses));
	}
	public static double investir (double investimentos, int meses) { 	
			 
			double r = investimentos;
			for (int i=1;i<=meses;i++) {
				
			
				r += r*1/100; 
			
			}	
		return r;
	}		
			
}

		
		
		
		
		
		
		
		

		
		

	
