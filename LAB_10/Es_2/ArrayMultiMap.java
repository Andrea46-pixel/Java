public class ArrayMultiMap implements MultiMap{

	private Pair[] p;
	private int pSize;

	public ArrayMultiMap(){
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
		if(key == null || value == null){
			throw new IllegalArgumentException();
		}
		if(pSize == p.length){
			p = resize(p, 2*p.length);						
		}
		p[pSize] = new Pair(key, value);
		pSize++;
	}
	//FATTO
	private Pair[] resize(Pair[] t, int dim){
		Pair[] x = new Pair[dim];
		System.arraycopy(t, 0, x, 0, p.length);
		return x;
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
		for(int i = 0; i < pSize; i++){
			if(p[i].getKey().equals(key)){
				Object old = p[i].getValue();
				p[i] = p[pSize-1];
				pSize--;
				return old;
			}
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
		for(int i = 0; i < pSize; i++){
			if(p[i].getKey().equals(key)){
				Object obj = p[i].getValue();
				return obj;
			}
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
			if(p[i].getKey().equals(key)){
				//FARE RESIZE
				x[index] = p[i].getValue();
				index++;
			}
		}
		if(index+1 < pSize){
			x = resizeObj(x, index+1);
		}
		return x;
	}
	//FATTO
	private Object[] resizeObj(Object[] o, int dim){
		Object[] q = new Object[dim];
		System.arraycopy(o, 0, q, 0, dim);
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
			x[i] = p[i].getKey();
		}
		return x;
	}
	//FATTO
	public int size(){
		return pSize;
	}

	/**
	Se ci sono associazioni di chiave uguale a key, ne 
	restituisce i valori, altrimenti restituisce un 
	array vuoto.
	@param key la chiave specificata 
	@return valori associati alla chiave specificata, 
	se presente, o un array vuoto altrimenti  
	*/ 
	//FATTO
	public Object[] removeAll(Object key){
		Object[] x = new Object[pSize];
		int index = 0;
		for(int i = 0; i < pSize; i++){
			if(p[i].getKey().equals(key)){
				x[index] = p[i].getValue();
				index++;
				p[i] = p[pSize-1];
				pSize--;
				i--;
			}
		}
		if(index+1 < pSize){
			x = resizeObj(x, index+1);
		}
		return x;
	}

	
	private class Pair{
		private Object key;
		private Object value;
	
		public Pair(Object k, Object v){
			setKey(k);
			setValue(v);
		}
		
		public void setKey(Object k){
			key = k;
		}
		public void setValue(Object v){
			value = v;
		}
		public Object getKey(){
			return key;
		}
		public Object getValue(){
			return value;
		}
	}

}
