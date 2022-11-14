import java.util.Scanner;
public class Substring2{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
		int counter;
		System.out.println("Inserisci una stringa");
		str1 = sc.nextLine();
		
		do{
		    System.out.println("Inserisci una stringa");
		    str2 = sc.nextLine();
		    if (str1.length() < str2.length()) System.out.println("Stringa non valida (dimensione > di str2)");
		}while(str1.length() < str2.length());
		
		if (str2.length() == 0){
		  System.out.println(str2 + " è contenuta in " + str1);
		}
		else {
		
		for (int i = 0; i <= (str1.length() - str2.length()); i++){
		  String string1 = "";
		  for (int j =i; j< i + str2.length(); j++){
		    string1 = string1 + str1.charAt(j);
		  }
		  //System.out.println(string1);
		  counter = 0;
		  for (int k = 0; k< str2.length(); k++){
		    if (str2.charAt(k) == string1.charAt(k)){
		      counter ++;
		      //System.out.println(counter);
		    }
		    if (counter == string1.length()){
		      System.out.println(str2 + " è contenuta in " + str1);
		      break;
		    }
		    else if (i == str1.length() - str2.length()){
		      System.out.println("La stringa non è presente");
		    }
		  }
		  if (counter == string1.length()) break;
		}
		}
	}
}
