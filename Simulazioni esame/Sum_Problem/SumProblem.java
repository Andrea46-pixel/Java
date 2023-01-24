import java.util.Scanner;
import java.util.Random;

public class SumProblem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		int dim = 0;
		do{
			System.out.println("Dimensione:");
			//check = sc.hasNextInt();
			if(sc.hasNextInt())	dim = sc.nextInt();
			else	System.out.println("Errore. Riprova");
			sc.nextLine();
		}while(dim <= 0);
		//int dim = sc.nextInt();
		
		//int[] arr = new int[dim];
		int[] arr = {34,45,-34,1,8,7,-1,-8,0,10};
		int[] coppie = new int[dim];
		int index = 0;

		/*Random rn = new Random(123);
		for(int i = 0; i < arr.length; i++){
			arr[i] = rn.nextInt(201) - 100;
		}*/

		/*for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}*/

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){
				if(i != j && arr[i]+arr[j] == 0 && i != coppie[j]){
					coppie[i] = j;
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}
	}
}
