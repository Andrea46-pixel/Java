import java.util.Scanner;
import java.util.Random;

public class SumProblem2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int dim = 0;
		do{
			System.out.println("Dimensione:");
			if(sc.hasNextInt())	dim = sc.nextInt();
			else	System.out.println("Errore. Riprova");
			sc.nextLine();
		}while(dim <= 0);
		
		int[] arr = new int[dim];
		int[] coppie = new int[dim];

		Random rn = new Random();
		for(int i = 0; i < arr.length; i++){
			arr[i] = rn.nextInt(201) - 100;
		}
		
		System.out.println("========= ARRAY ==========");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("========= COPPIE ==========");
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
