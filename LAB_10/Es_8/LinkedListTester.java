import java.util.Scanner;
import java.util.Random;
public class LinkedListTester{

	public static void main(String[] args){

		LinkedList p = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero intero");
		while(!(sc.hasNextInt())){
			System.out.println("Errore. Inserisci un numero intero:");
		}
		int n = sc.nextInt();

		Random rn = new Random(123);
		for(int i = 0; i < n; i++){
			int v = rn.nextInt(100)+1;
			System.out.println("Valore da inserire: " + v);
			if((i%2) == 0){
				p.addFirst(v);
			}
			else{
				p.addLast(v);
			}

			System.out.println(p.toString());
			
		}

		System.out.println("Dopo quale elemento presente nella lista si vuole inserire il valore 1000?");
		int e = sc.nextInt();

		ListIterator iter = p.getIterator();
		while(iter.hasNext()){
			if(iter.next().equals(e)){
				iter.add(1000);
			}
		}
		System.out.println(p);
		
		System.out.println("elemento da eliminare:");
		e = sc.nextInt();

		iter = p.getIterator();
		while(iter.hasNext()){
			if(iter.next().equals(e)){
				iter.remove();
			}
		}
		System.out.println(p);

		System.out.println("Rimuovo il primo elemento");
		Object obj = p.removeFirst();
		System.out.println(p);

		System.out.println("Rimuovo l'ultimo elemento");
		obj = p.removeLast();
		System.out.println(p);



		sc.close();

	}	

}
