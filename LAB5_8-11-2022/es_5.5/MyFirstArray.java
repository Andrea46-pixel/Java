public class MyFirstArray{

	public static void main(String[] args){

		int[] arr1 = new int[10];
		for (int i=0; i<arr1.length; i++){
			arr1[i] = i;		
		}
		
		//PARTE A
		System.out.println("Dimensione: "+arr1.length);	
		printArray(arr1);
		for (int i=(arr1.length-1); i>=0; i--){
			System.out.println(arr1[i]);		
		}
		
		//PARTE B
		incrementAll(arr1);
		printArray(arr1);

		//PARTE C
		int var1 = 26;
		System.out.println("Prima: "+var1);
		incrementVar(var1);
		System.out.println("Dopo: "+var1);
		

	}

	private static void printArray(int[] b){
		for (int i=0; i<b.length; i++){
			System.out.println(b[i]);		
		}
	}	

	//PARTE B
	public static void incrementAll(int[] a){
		for (int i=0; i<a.length; i++){
			a[i] = i+1;		
		}
	}
	//PARTE C
	private static void incrementVar(int value){
		System.out.println("Metodo: "+value);
		value = value + 1;
		System.out.println("Metodo: "+value);
	}

}
