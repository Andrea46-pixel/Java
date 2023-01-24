import java.util.Scanner;

public class VocalsCounter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una stringa");
		String s = sc.next();
		int n = counter(s);
		System.out.println(n);

		
	}

	public static int counter(String s){
		//se la stringa è nulla ritorno un numero negativo
		if(s == null)	return -1;
		//caso base
		if(s.length() < 1)	return 0;

		int n = 0;
		String st = s.substring(0,1).toLowerCase();
		//controllo se la prima lettera della stringa è una vocale
		if(st.equals("a") || st.equals("e") || st.equals("i") || st.equals("o") || st.equals("u")){
			n = 1;
		}
		//passo ricorsivo
		return n + counter(s.substring(1));
	}
}
