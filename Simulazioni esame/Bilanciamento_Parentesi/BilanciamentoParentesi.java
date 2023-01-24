public class BilanciamentoParentesi{
	public static void main(String[] args){
		String s = "()(())()()";
		int n = 0;
		int check = bilanciatore(s,n);
		System.out.println(check);
		
	}
	
	public static int bilanciatore(String s, int nr){
		//se la stringa è nulla ritorno un numero negativo diverso da -1
		if(s == null) return -2;
		//controllo se c'è una disparità tra parentesi aperte e chiuse
		if(nr < 0){
			return -1;
		}
		//caso base
		if(s.length() < 1) return 0;
		//se c'è una parentesi aperta incremento il contatore di 1
		if(s.substring(0,1).equals("(")){
			nr++;	
		}
		//se c'è una parentesi chiusa decremento il contatore di 1
		else if(s.substring(0,1).equals(")")){
			nr--;
		}
		//passo ricorsivo
		return bilanciatore(s.substring(1), nr);
	}
}
