public class ArraySet implements Set{

	private Object[] v;
	private int vsize;

	public ArraySet(){
		v = new Object[1];
		makeEmpty();
	}	
	//FATTO
	public void add(Object obj){
		if(contains(obj) == true){
			return;
		}
		if(vsize == v.length){
			v = resize(v, 2*v.length);				
		}
		v[vsize] = obj;
		vsize++;
	}
	//FATTO
	private Object[] resize(Object[] obj, int dim){
		Object[] obj2 = new Object[dim];
		System.arraycopy(obj, 0, obj2, 0, vsize);
		return obj2;
	}
	//FATTO
	public boolean contains(Object obj){
		for(int i = 0; i < vsize; i++){
			if(v[i].equals(obj)){
				return true;
			}
		}
		return false;
	}
	//FATTO
	public Object[] toArray(){
		Object[] x = new Object[vsize];
		System.arraycopy(v, 0, x, 0, vsize);
		return x;
	}
	//FATTO
	public boolean isEmpty(){
		return (vsize == 0);
	}
	//FATTO
	public void makeEmpty(){
		vsize = 0;
	}
	//FATTO
	public int size(){
		return vsize;
	}
	
	//FATTO
	public static Set union(Set s1, Set s2){
		Set x = new ArraySet();
		Object[] v = s1.toArray();
		for(int i = 0; i < v.length; i++){
			x.add(v[i]);
		}
		v = s2.toArray();
		for(int i = 0; i < v.length; i++){
			x.add(v[i]);
		}
		return x;
	}
	//FATTO
	public static Set intersection(Set s1, Set s2){
		Set x = new ArraySet();
		Object[] v = s1.toArray();
		for(int i = 0; i < v.length; i++){
			if(s2.contains(v[i])){
				x.add(v[i]);
			}
		}
		return x;
	}

	public static Set subtract(Set s1, Set s2){
		Set x = new ArraySet();
		Object[] v = s1.toArray();
		for(int i = 0; i < v.length; i++){
			if(!s2.contains(v[i])){
				x.add(v[i]);
			}		
		}
		return x;
	}

}
