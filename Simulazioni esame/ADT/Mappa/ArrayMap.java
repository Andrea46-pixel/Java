public class ArrayMap implements Map{

	private Pair[] p;
	private int psize;
	private static final int CAPACITY = 1;

	public ArrayMap(){
		p = new Pair[CAPACITY];
		makeEmpty();
	}	
	
	//inserisce un'associazione nella mappa
	//se esisteva già un'associazione con la stessa chiave, sostiutisco il valore vecchio e lo restituisco
	public Object put(Object key, Object value){
		if(key == null || value == null){
			throw new IllegalArgumentException();
		}
		Object old = remove(key);

		if(psize == p.length){
			p = resize(p, 2*p.length);
		}
		p[psize] = new Pair(key, value);
		psize++;
		return old;
	}

	protected Pair[] resize(Pair[] obj, int dim){
		Pair[] p2 = new Pair[dim];
		System.arraycopy(obj, 0, p2, 0, obj.length);
		return p2;
	}
		
	//restituisce l'elemento associato a key
	public Object get(Object key){	
		for(int i = 0; i < psize; i++){
			if(p[i].getKey().equals(key)){
				return p[i].getValue();
			}
		}
		return null;	//l'elemento ricercato non è presente
	}

	//restituisce l'elemento associato a key e rimuove l'associazione
	public Object remove(Object key){
		for(int i = 0; i < psize; i++){
			if(p[i].getKey().equals(key)){
				Object obj = p[i].getValue();
				p[i] = p[psize-1];
				psize--;
				return obj;
			}
		}
		return null;	//l'elemento ricercato non è presente
	}

	//restituisce un array con le chiavi contenute nella mappa
	public Object[] keys(){
		Object[] keys = new Object[psize];
		for(int i = 0; i < psize; i++){
			keys[i] = p[i].getKey();
		}
		return keys;
	}

	public void makeEmpty(){
		psize = 0;
	}

	public boolean isEmpty(){
		return (psize == 0);
	}

	public int size(){
		return psize;
	}

	

	private class Pair{
		private Object key;
		private Object value;

		public Pair(Object k, Object v){
			setKey(k);
			setValue(v);
		}
		
		public Object getKey(){
			return key;
		}
		public Object getValue(){
			return value;
		}
		public void setKey(Object k){
			key = k;
		}
		public void setValue(Object v){
			value = v;
		}
	}
}
