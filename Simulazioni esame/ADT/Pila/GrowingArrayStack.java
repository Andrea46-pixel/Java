public class GrowingArrayStack extends FixedArrayStack{

	public void push(Object obj){
		if(vsize == v.length){
			v = resize(v, 2*vsize);
		}
		super.push(obj);
	}

	protected Object[] resize(Object[] obj1, int size){
		Object[] obj2 = new Object[size];
		System.arraycopy(obj1, 0, obj2, 0, size);
		return obj2;
	}
}
