import java.util.Scanner;
public class Prova{
	public static void main(String[] args){
		Scanner  sc = new Scanner(System.in);
		System.out.println("index:");
		int index = sc.nextInt();
		System.out.println("v.length:");
		int length = sc.nextInt();
		int res = (index+1)%length;
		System.out.println("RISULTATO: "+res);
	}
}
