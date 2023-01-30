import java.util.Scanner;
public class ListReverse{

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digita un numero");
		int n = sc.nextInt();

		LinkedList list = new LinkedList();
		for(int i = 0; i < n; i++){
			list.addLast(i);
		}

		System.out.println(list);
		sc.close();

		ListIterator iter = list.getIterator();
		printReverse(iter);
	}

	public static void printReverse(ListIterator l){
	
		if(!l.hasNext()){
			return;
		}
		Object obj = l.next();
		printReverse(l);
		System.out.print(obj+" ");

	}

}
