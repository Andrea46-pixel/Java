public class ArraySortedSet implements SortedSet{
	private Comparable[] v;
	private int vsize;

	public ArraySortedSet(){
		v = new Comparable[1];
		makeEmpty();
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
	public void add(Object obj){
		throw new IllegalArgumentException();
	}
	//FATTO
	public int size(){
		return vsize;
	}
	//FATTO
	public Object[] toArray(){
		return toSortedArray();
	}
	//FATTO
	public Comparable[] toSortedArray(){
		Comparable[] x = new Comparable[vsize];
		System.arraycopy(v, 0, x, 0, vsize);
		return x;
	}
	//FATTO
	public void add(Comparable obj){
		if(contains(obj)){
			return;
		}
		if(vsize == v.length){
			v = resize(v, 2*v.length);
		}
		v[vsize] = obj;
		vsize++;
	}
	//FATTO
	private Comparable[] resize(Comparable[] v, int dim){
		Comparable[] x = new Comparable[dim];
		System.arraycopy(v, 0, x, 0, vsize);
		return x;
	}
	//FATTO
	public boolean contains(Object obj){
		int res = binSearch(0, vsize-1, (Comparable)obj);
		if(res >= 0){
			return true;
		}
		return false;
	}
	//FATTO
	private void insertionSort(Comparable[] c){
		for(int i = 1; i < c.length; i++){
			for(int j = i-1; j >= 0; j--){
				int comp = c[j].compareTo(c[j+1]);
				if(comp > 0){
					Comparable help = c[j+1];
					c[j+1] = c[j];
					c[j] = help;
				}			
			}
		}
	}
	//FATTO
	private int binSearch(int left, int right, Comparable target){
		if(right < left){
			return -1;
		}
		int mid = (left+right)/2;
		int comp = v[mid].compareTo(target);
		if(comp == 0){
			return mid;
		}
		else if(comp < 0){
			return (binSearch(mid+1, right, target));
		}
		else{
			return (binSearch(left, mid-1, target));
		}
		
	}
	
	//FATTO
	public static SortedSet union(SortedSet s1, SortedSet s2){
		SortedSet x = new ArraySortedSet();
		Comparable[] v1 = s1.toSortedArray();
		Comparable[] v2 = s2.toSortedArray();

		int i = 0, j = 0;
		while(i < v1.length && j < v2.length){
			if(v1[i].compareTo(v2[j]) < 0){
				x.add(v1[i]);
				i++;
			}
			else if(v1[i].compareTo(v2[j]) > 0){
				x.add(v2[j]);
				j++;
			}
			else{
				x.add(v1[i]);
				i++;
				j++;			
			}
		}
		while(i < v1.length){
			x.add(v1[i]);
			i++;		
		}
		while(j < v2.length){
			x.add(v2[j]);
			j++;		
		}

		return x;
	}
	//FATTO
	public static SortedSet intersection(SortedSet s1, SortedSet s2){
		SortedSet x = new ArraySortedSet();
		Comparable[] v1 = s1.toSortedArray();
		Comparable[] v2 = s2.toSortedArray();
	
		for(int i = 0, j = 0; i < v1.length; i++){
			while(j < v2.length && v1[i].compareTo(v2[j]) > 0){
				j++;
			}
			if(j == v2.length){
				break;
			}
			if(v1[i].compareTo(v2[j]) == 0){
				x.add(v1[i]);
				j++;
			}
		}
		return x;
	}
	//FATTO
	public static SortedSet subtract(SortedSet s1, SortedSet s2){
		SortedSet x = new ArraySortedSet();
		Comparable[] v1 = s1.toSortedArray();
		Comparable[] v2 = s2.toSortedArray();
		int i,j;
		for(i = 0, j = 0; i < v1.length; i++){
			while(j < v2.length && v1[i].compareTo(v2[j]) > 0){
				j++;
			}
			if(j == v2.length){
				break;
			}
			if(v1[i].compareTo(v2[j]) != 0){
				x.add(v1[i]);
			}
		}
		while(i < v1.length){		
			x.add(v1[i]);
			i++;
		}
		return x;
	}
	
}
