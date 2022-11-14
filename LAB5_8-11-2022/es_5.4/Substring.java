import java.util.Scanner;
public class Substring{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String str1, str2;
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
		else{
		
		  for (int i = 0; i <= (str1.length() - str2.length()); i++){
		    String string1 = str1.substring(i, i+str2.length());
		   //System.out.print("Is " + str2 +" equal to "+string1 +"? ");
		   //if(string1.equals(str2)) System.out.println("YES!");
		   //else System.out.println("NO!");
		   if(string1.equals(str2)){
		      System.out.println(str2 +" è contenuta in " + str1);
		      break;
		   }
		   else if (i == (str1.length() - str2.length())) {
		      System.out.println(str2 +" NON è contenuta in " + str1);
		    }
		  
		  }
	  }
	}

}
