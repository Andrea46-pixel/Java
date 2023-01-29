import java.util.Scanner;
public class DequeTester{
	public static void main(String[] args){
		ArrayDeque uno = new ArrayDeque();
	ArrayDeque due = new ArrayDeque();
	ArrayDeque tre = new ArrayDeque();

	Scanner sc = new Scanner(System.in);
	for(int i = 0; i < 5; i++){
		System.out.println("Digita un numero");
		uno.addLast(sc.next());
	}
	int q = uno.getSize();
	for(int i = 0; i < q; i++){
		due.addFirst(uno.removeLast());
	}
	for(int i = 0; i < q; i++){
		tre.addLast(due.removeFirst());
	}
	for(int i = 0; i < q; i++){
		System.out.println(tre.removeFirst());
	}
	
	}
	

	
}
