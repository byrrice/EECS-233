//class that represents the node for the entry
public class Entry {
  
  public String key;
  public int count;
  public Entry next;
  
  //constructor initializing the variables
  Entry(String key, int count) {
    this.key = key;
    this.count = count;
    this.next = null;
  }
 
  //toString method printing out the word and the count it appears
  public String toString(){
      return "" + this.key.toString() + " : " + String.valueOf(this.count) + "";
    }
}

