public class SortedArrayMultiMap implements MultiMap{

	private Pair[] p;
	private int pSize;

	public SortedArrayMultiMap(){
		p = new Pair[1];
		makeEmpty();
	}

	//FATTO
	public boolean isEmpty(){
		return (pSize == 0);
	}
	//FATTO
	public void makeEmpty(){
		pSize = 0;
	}
	/**
	Inserisce nel dizionario un’associazione avente 
	chiave uguale a key e valore uguale a value.
	@param key la chiave specificata
	@param value il valore specificato
	@throws IllegalArgumentException se key o value sono null
	*/
	//FATTO
	public void insert(Object key, Object value){
		if(key == null || value == null || !(key instanceof Comparable)){
			throw new IllegalArgumentException();
		}
		
		if(pSize == p.length){
			p = resize2(p, 2*p.length);
		}		

		int i = pSize-1;
		while(i >= 0 && ((Comparable)key).compareTo(p[i].getKey()) < 0){
			p[i+1] = p[i];
			i--;
		}
		p[i+1] = new Pair((Comparable)key, value);
		pSize++;
	}
	//FATTO
	private Pair[] resize2(Pair[] t, int dim){
		Pair[] x = new Pair[dim];
		System.arraycopy(t, 0, x, 0, t.length);
		return x;
	}
	//FATTO
	private int binSearch(int from, int to, Comparable target){
		if(to < from){
			return -1;
		}
		
		int mid = (from + to)/2;
		int pos = p[mid].getKey().compareTo(target);
		if(pos == 0){
			return mid;
		}
		else if(pos > 0){
			return binSearch(from, mid-1, target);
		}
		else{
			return binSearch(mid+1, to, target);
		}
	}

	
	/**
	Elimina dal dizionario un’associazione di chiave specificata 
	restituendone il valore associato oppure null se non e’ 
	presente nel dizionario.
	@param key la chiave specificata
	@return un valore associato alla chiave specificata, 
	se presente, null altrimenti
	*/
	//FATTO
	public Object remove(Object key){
		int i = binSearch(0, pSize-1, (Comparable)key);
		if(i >= 0){
			Object old = p[i].getValue();
			for(int k = i; k < pSize; k++){
				p[k] = p[k+1];
			}
			pSize--;
			return old;
		}
		return null;
	}

	/**
	Se il dizionario contiene un’associazione avente 
	chiave uguale a key, restituisce true, 
	altrimenti restituisce false 
	@param key la chiave specificata
	@return uno dei valori associati se la chiave specificata e’ 
		presente, altrimenti null
	*/ 
	//FATTO
	public Object find(Object key){
		int i = binSearch(0, pSize-1, (Comparable)key);
		if(i >= 0){
			return p[i].getValue();
		}
		return null;
	}

	/**
	Se il dizionario contiene una o più associazioni aventi chiave 
	uguale a key, restituisce i valori, altrimenti restituisce un 
	array vuoto 
	@param key la chiave specificata
	@return un array con i valori associati alla chiave specificata, 
	se presente, o un array vuoto se non presente
	*/ 
	//FATTO
	public Object[] findAll(Object key){
		Object[] x = new Object[pSize];
		int index = 0;
		for(int i = 0; i < pSize; i++){
			if(((Comparable)key).compareTo(p[i].getKey()) == 0){
				x[index] = p[i].getValue();
				index++;
			}
		}
		if(index+1 < pSize){
			x = resize(x, index+1);
		}
		return x;
	}
	//FATTO
	private Object[] resize(Object[] t, int dim){
		Object[] q = new Object[dim];
		System.arraycopy(t, 0, q, 0, dim);
		return q;
	}

	/**
	@return un array contenente le chiavi del 
	dizionario, eventualmente ripetute. Restituisce un
	array vuoto (0 elementi) se il dizionario e’ vuoto 
	*/ 
	//FATTO
	public Object[] keys(){
		Object[] x = new Object[pSize];
		for(int i = 0; i < pSize; i++){
			x[i] = (Object)p[i].getKey();
		}
		return x;
	}

	/**
	Se ci sono associazioni di chiave uguale a key, ne 
	restituisce i valori, altrimenti restituisce un 
	array vuoto.
	@param key la chiave specificata 
	@return valori associati alla chiave specificata, 
	se presente, o un array vuoto altrimenti  
	*/ 
	public Object[] removeAll(Object key){
		Object[] x = new Object[pSize];
		int index = 0;
		for(int i = 0; i < pSize; i++){
			if(((Comparable)key).compareTo(p[i].getKey()) == 0){
				x[index] = p[i].getValue();
				index++;
				for(int k = i; k < pSize; k++){
					p[k] = p[k+1];
				}
				pSize--;
				i--;
			}
		}
		if(index+1 < pSize){
			x = resize(x, index+1);
		}
		return x;
	}

	public int size(){
		return pSize;
	}
	


	private class Pair{
		private Comparable key;
		private Object value;

		public Pair(Comparable k, Object v){
			setKey(k);
			setValue(v);
		}

		public void setKey(Comparable k){
			key = k;
		}
		public void setValue(Object v){
			value = v;
		}
		public Comparable getKey(){
			return key;
		}
		public Object getValue(){
			return value;
		}


	}

}
