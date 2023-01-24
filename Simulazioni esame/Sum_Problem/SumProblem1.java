import java.util.Scanner;
import java.util.Random;

public class SumProblem1{
	public static void main(String[] args){
		
		//CREO UN ARRAY DI INTERI
		int[] arr = {34,45,-34,1,8,7,-1,-8,0,10};
		int[] coppie = new int[10];
		
		//STAMPO A SCHERMO IL CONTENUTO DELL'ARRAY
		System.out.println("========= ARRAY ==========");
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

		//ATTRAVERSO UN DOPPIO CICLO FOR CERCO LE COPPIE LA CUI SOMMA è ZERO
		System.out.println("========= COPPIE ==========");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr.length; j++){				
				if(i != j && arr[i]+arr[j] == 0 && i != coppie[j]){	//il controllo "i != j" servè nel caso in cui nell'array ci sia un solo elemento con valore 0. In queso caso ad un certo punto sommando sè stesso ci restituirebbe la presenza di una coppia 0,0 che è cosa non vera
					coppie[i] = j;
					System.out.println(arr[i]+" , "+arr[j]);
				}
			}
		}
	}
}
