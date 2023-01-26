public class SortedArraySortedMap implements SortedMap{
	
	private Pair[] p;
	private int psize;

	public SortedArraySortedMap(){
		p = new Pair[1];
		makeEmpty();
	}
	
	public void makeEmpty(){
		psize = 0;
	}

	public boolean isEmpty(){
		return (psize == 0);
	}

	//===========================================================================================================
	//FATTO
	//inserisce un'associazione nella mappa
	//se esisteva già un'associazione con la stessa chiave, sostiutisco il valore vecchio e lo restituisco
	public Object put(Object key, Object value){
		if(key == null || value == null || !(key instanceof Comparable)){
			throw new IllegalArgumentException();
		}
		int pos = binSearch(key);
		if(pos >= 0){
			Object obj = p[pos].getValue();
			p[pos] = new Pair((Comparable)key, value);
			return obj;
		}
		
		if(psize == p.length){
			p = resize(p, 2*p.length);		
		}	
		
		int i = psize-1;
		while(i >= 0 && ((Comparable)key).compareTo(p[i].getKey())<0){
			p[i+1] = p[i];
			i--;
		}		
		p[i+1] = new Pair((Comparable)key, value);
		psize ++;
		return null;
	}
	
	//FATTO
	private Pair[] resize(Pair[] obj, int dim){
		Pair[] p2 = new Pair[dim];
		System.arraycopy(obj, 0, p2, 0, obj.length);
		return p2;
	}
	
	//FATTO
	//restituisce l'elemento associato a key
	public Object get(Object key){
		int pos = binSearch(key);
		if(pos == -1){
			return null;	//l'elemento non è presente
		}
		return p[pos].getValue();	
	}

	//FATTO
	//restituisce l'elemento associato a key e rimuove l'associazione
	public Object remove(Object key){
		int pos = binSearch(key);
		if(pos == -1){
			return null;
		}
		Object obj = p[pos].getValue();
		for(int i = pos; i < psize-1; i++){
			p[i] = p[i+1];
		}
		psize--;		
		return obj;
	}

	//FATTO
	//restituisce un array con le chiavi contenute nella mappa
	public Object[] keys(){
		return sortedKeys();
	}
	
	
	//restituisce un array contenente le chiavi ordinate
	public Comparable[] sortedKeys(){
		return null;
	}
	
	//FATTO
	private int binSearch(Object key){
		if(!(key instanceof Comparable)){
			return -1;
		}
		return binarySearch(0, psize -1, (Comparable)key);
	}
	
	//FATTO
	//ricerca binaria
	private int binarySearch(int left, int right, Comparable target){
		if(right < left){
			return -1;		
		}
		int m = (left+right)/2;
		int comp = p[m].getKey().compareTo(target);
		if(comp == 0){
			return m;
		}
		else if(comp < 0){
			return binarySearch(m+1, right, target);
		}
		else{
			return binarySearch(left, m-1, target);
		}
		
	}


	//===========================================================================================================
	private class Pair{
		
		private Comparable key;
		private Object value;

		public Pair(Comparable k, Object v){
			setKey(k);
			setValue(v);
		}
		
		public Comparable getKey(){
			return key;
		}
		public Object getValue(){
			return value;
		}
		public void setKey(Comparable k){
			key = k;
		}
		public void setValue(Object v){
			value = v;
		}
	}

}
