import java.util.Random;

public class SumProblem1{
	
	public static void main(String[] args){

		//i valori dell'array vanno da -100 a 100
		Random r = new Random(124);
		//int[] array = new int[10];
		
		int[] array = {24, 10, -3, -99, -24, -2, 2, 5, 33, 10};
		boolean[] tester = new boolean[10];
		//boolean[][] matrice = new boolean[10][2];
		/*for(int i = 0; i < 10; i++){
			array[i] = r.nextInt(200)-100;
		}*/
		
		for(int i = 0; i < 10; i++){
			System.out.println(array[i]);
		}


		for(int i = 0; i < 10; i++){
	
			for(int j = 0; j < 10; j++){
				if((array[i] + array[j]) == 0 && tester[i] == false){
					System.out.println("COPPIA: ("+ array[i] + "," + array[j] + ")");
					tester[i] = true;
					tester[j] = true;
				}
			}
		}
		
	}

}
