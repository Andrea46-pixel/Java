public class SortedArraySortedMap implements SortedMap{

   private Pair[] p;
   private int pSize;
   
   public SortedArraySortedMap(){
      p = new Pair[1];
      pSize = 0;
   }
   
   public boolean isEmpty(){
      return (pSize == 0);
   }
   
   public void makeEmpty(){
      pSize = 0;
   }
   
   public int size() {return pSize;}
   
   public Comparable[] sortedKeys(){
      Comparable[] keys = new Comparable[pSize];
      for(int i = 0; i < pSize; i++){
         keys[i] = (Comparable) p[i].getKey();
      }
      return keys;
   }
   
   public Object[] keys(){
      return sortedKeys();
   }
   
   public Object put(Object key, Object value){
      if(key == null || value == null || !(key instanceof Comparable)){
         throw new IllegalArgumentExcpetion();
      }
      
      int pos = binSearch(key);
      if(pos >= 0){
         Object old = p[pos].getValue();
         p[pos] = new Pair(key, valore);
         return old;
      }
      
      if(pSize == p.length()){
         p = resize(p, p.length()*2);
      }
      
      int i = pSize-1;
      while(i >= 0 && ((Comparable)key).compareTo(p[i].getKey())<0){
         p[i+1] = p[i];
         i--;
      }
      p[i+1] = new Pair(key, value);
      pSize++;
      return null;
   }
   
   public Object get(Object key){
      int pos = binSearch(key);
      if(pos == -1){
         return null;
      }
      return p[pos].getValue();
   }
   
   public Object remove(Object key){
      int pos = binSearch(key);
      if(pos == -1){
         return null;
      }
      Object obj = p[pos].getValue();
      for(int i = pos; i < pSize-1; i++){
         p[i] = p[i+1];
      }
      pSize--;
      return obj;
      
   }

   private class Pair{
      private Object key;
      private Object value;
      
      public Pair(Comparable k, Object v){
         setKey(k);
         setValue(v);
      }
      public Object getKey()  {return key;}
      public Object getValue()   {return value;}
      public Object setKey(Comparable k)  {key = k;}
      public Object setValue(Object v) {value = v;}
   }

}
