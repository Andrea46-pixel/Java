public class SortedArraySortedMap implements SortedMap{
	
	private Pair[] p;
	private int vSize;

	public SortedArraySortedMap(){
		p = new Pair[1];
		makeEmpty();
	}
	//FATTO
	public Comparable[] sortedKeys(){
		Comparable[] x = new Comparable[vSize];
		for (int i = 0; i < vSize; i++){ 
			x[i] = (Comparable) p[i].getKey();  
		}
		return x;
	}
	//FATTO
	public Object put(Object key, Object value){
		if(key == null || value == null || !(key instanceof Comparable)){
			throw new IllegalArgumentException();
		}
		int i = binSearch(0, vSize-1, (Comparable)key);
		if(i >= 0){
			Object old = p[i].getValue();
			p[i] = new Pair((Comparable)key, value);
			return old;
		}

		if(vSize == p.length){
			p = resize(p, 2*p.length);	
		}
		
		int k = vSize-1;
		while(k >= 0 && ((Comparable)key).compareTo(p[k].getKey())<0){
			p[k+1] = p[k];
			k--;
		}
		p[k+1] = new Pair((Comparable)key, value);
		vSize++;
		return null;
	}
	//FATTO
	public int size(){
		return vSize;
	}
	//FATTO
	public Object get(Object key){
		int i = binSearch(0, vSize-1, (Comparable)key);
		if(i >= 0){
			return p[i].getValue();
		}
		return null;
	}
	//FATTO
	public Object remove(Object key){
		if(key == null) return null;
		int i = binSearch(0, vSize-1, (Comparable)key);
		if(i >= 0){
			Object obj = p[i].getValue();
			for(int k = i; k < vSize-1; k++){
				p[i] = p[i+1];	
			}
			vSize--;
			return obj;
		}
		return null;
	}
	//FATTO
	private int binSearch(int from, int to, Comparable target){
		if(from > to){
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
	//FATTO
	private Pair[] resize(Pair[] p, int dim){
		Pair[] x = new Pair[dim];
		System.arraycopy(p, 0, x, 0, p.length);
		return x;
	}
	//TO CHECK
	public Object[] keys(){
		return sortedKeys();
	}
	//FATTO
	public boolean isEmpty(){
		return (vSize == 0);
	}
	//FATTO
	public void makeEmpty(){
		vSize = 0;
	}

	private class Pair{
		private Comparable key;
		private Object value;

		public Pair(Comparable k, Object val){
			setKey(k);
			setValue(val);
		}

		public void setKey(Comparable k){
			key = k;
		}
		public void setValue(Object val){
			value = val;
		}
		public Comparable getKey(){
			return key;
		}
		public Object getValue(){
			return value;
		}
	}
}
