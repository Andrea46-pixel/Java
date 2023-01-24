import java.io.*;
import java.util.*;
public class SumProblem2{
	
	public static void main(String[] args){

		//i valori dell'array vanno da -100 a 100
		int[] array = new int[10];
		
		boolean[] tester = new boolean[10];
		int dim = 0;
		int index = 0;

		try(FileReader r = new FileReader("array.txt"); Scanner sc = new Scanner(r)){
			while(sc.hasNext()){
				if(dim == (array.length-1)){
					array = resize(array, dim*2);
				}
				try{
					array[index] = Integer.parseInt(sc.next());
					index++;
				}
				catch(NumberFormatException er){
					System.out.println("Errore stringa");
				}
				
			}
		}
		catch(IOException e){
			System.out.println("Errore");
		}
		System.out.println("INDEX: "+index);
		array = resize(array, index);
		
		for(int i = 0; i < index; i++){
			System.out.println(array[i]);
		}


		for(int i = 0; i < index; i++){
	
			for(int j = 0; j < index; j++){
				if((array[i] + array[j]) == 0 && tester[i] == false){
					System.out.println("COPPIA: ("+ array[i] + "," + array[j] + ")");
					tester[i] = true;
					tester[j] = true;
				}
			}
		}
		
	}


	public static int[] resize(int[] arr, int newDim){
		int[] arr1 = new int[newDim];
		for(int i = 0; i < newDim; i++){
			arr1[i] = arr[i];
		}
		return arr1;
	}

}
