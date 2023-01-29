public class ArrayTable100 implements Table{

	private Object[] v;
	private int count; // count rende isEmpty O(1)   
	
	//costruttore
	public ArrayTable100(){  
	   v = new Object[100];
	   makeEmpty();
	}
   
	// metodi di Container
	public void makeEmpty(){
		count = 0;
	}

	public boolean isEmpty(){
		return (count == 0);
	}
   
	// metodi di utilita'
	private void check(int key){
		if (key < 0 || key >= v.length){
			throw new InvalidPositionTableException();
		} 
	}
   
	//metodi dell'interfaccia Table
   
	//implementiamo insert in modo che se si inserisce
	//un'associazione con chiave gia' utilizzata, il
	//valore ad esso assciato viene sostituito
	public void insert(int key, Object value){
		check(key);
		if (v[key] == null){
			count++;
			v[key] = value;
		}
		else v[key] = value;
	}
   
	public void remove(int key){
		check(key); 
		if (v[key] != null){
			count--;
			v[key] = null;
		}
	}
   
	public Object find(int key){
		check(key);
		return v[key];
	}

}
