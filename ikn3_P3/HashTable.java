// this class represents the hashtable
public class HashTable{
  
  private int tablesize;
  private int size; 
  private Entry[] table;
  
  // Constructor for the hashtable
  public HashTable() {
    size = 1;
    tablesize = 128;
    table = new Entry[tablesize];
    //initializing the hashtable
    for (int i = 0; i < tablesize; i++)
      table[i] = null;
  } 
  
  // getting the number of entries
  public int getSize(){
    return size;
  }
  
  // Helper method that returns hashcode of string
  private int hashcoder(String s){
    int value = s.hashCode() % tablesize;
    return Math.abs(value);
  }
  
  //getting the tablesize
  public int getTableSize(){
    return tablesize;
  }
  
  // function that gets the value of the key 
  public int get(String key) {
    int value = (hashcoder(key)%tablesize);
    //return -1 if value is not there
    if (table[value] == null)
      return -1;
    else {
      //find index where it is at
      Entry entry = table[value];
      //incrementing through the list until find the same key and then return value
      while (entry != null && !entry.key.equals(key))
        entry = entry.next;
      if (entry == null)
        return -1;
      else
        return entry.count;
    }
  }
  
  //method to insert a key and value 
  public void add(String key) {
    
    int code = (hashcoder(key) % tablesize);
    
    //if first insertion 
    if (table[code] == null)
      table[code] = new Entry(key, 1);
    else {
      Entry entry = table[code];
      //incrementing through the list until it either reaches the same word or the next one is null
      while (!entry.key.equals(key) && entry.next != null)
        entry = entry.next;
      //increment the count if same string
      if (entry.key.equals(key))
        entry.count = entry.count + 1;
      //create new entry and link if entry can't be found
      else
        entry.next = new Entry(key, 1);
    }
    //add one to the size
    size++;
    
    //if load factor is bigger than 7 load new table by doubling it by two
    if ((1.0*size)/tablesize >= 0.7){
      
      //doubling tablesize
      tablesize = 2 * tablesize;
      //creating the temp array to transfer values too
      Entry[] temp = table;
      table = new Entry[tablesize];
      
      //transferring the values
      for (int i = 0; i < temp.length; i++)
        table[i] = temp[i];
    }
  }
  
  //converts to String
  public String toString(){
    StringBuilder sb = new StringBuilder();
    //runs through the array and appends the words and counts to a stringbuilder
    for (int i = 0; i < tablesize; i++){
      Entry entry = table[i];
      if (entry != null){
        sb.append(table[i].toString());
        sb.append ("\r\n");
        //incrementing
        entry = entry.next;
      }
    }
    //return the string
    return sb.toString();
  }
}