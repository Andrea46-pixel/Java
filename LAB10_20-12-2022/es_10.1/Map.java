public interface Map extends Container{

   //inserisce un'associazione nella mappa. Se esisteva già un'associazione con la stessa chiave, sostituisco il valore vecchio e lo restituisco
   Object put(Object key, object value);
   
   //restituisce l'elemento associto a key
   Object get(Object key);
   
   //restituisce l'elemento associato a key e rimuove l'associazione
   Object remove(Object key);
   
   //restituisce un array con le chiavi contenute nella mappa
   Object[] keys();

}
