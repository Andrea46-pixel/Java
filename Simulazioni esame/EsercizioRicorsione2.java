public class EsercizioRicorsione2{
			static String s = "Mississippi";
	public static void main(String[] args){

		String str = "sippp";
		
		System.out.println(indexOf(s,str));

		
	}
	
	public static int indexOf(String text, String str){
			if(text.length() < 5)	return -1;			
			if(str.equals(text.substring(0,3))){
				return 0;			
			}	
			return 1 + indexOf(text.substring(1,text.length()),str);
		}
		
		public static int pos(String s, String text){
		
		return s.length()-text.length();

}

}
