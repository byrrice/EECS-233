/**
 * An abstract class to represent a series of Phonebook Entries
 * @author Isaac Ng
 */
public abstract class FBList{
  
  //all methods to be implemented later on
  
  public abstract int size();
  
  public abstract void insert(int i, Person person);
  
  public abstract Person remove(int i);
  
  public abstract Person lookup(int i);
  
  public abstract long[] getNumbers();
  
}