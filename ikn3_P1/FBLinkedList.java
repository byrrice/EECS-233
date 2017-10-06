import java.util.*;

/**
 * A class to represent the LinkedList implementation of FBList
 * @author Isaac Ng
 */
public class FBLinkedList extends FBList{
  
  //the linkedlist containing the people
  private LinkedList<Person> list;
  
  //the counter measuring the length of the linked list
  private int size;
  
  //The first front node
  private LLNode<Person> front;
  
  /**
   * the constructor, sets the first node to null and the size to be 0
   */
  public FBLinkedList() {
    front = null;
    size = 0;
  }
  
  /**
   * Finds the size of the linkedlist
   * Running Time: constant, no for loop
   * @return the size of the linkedlist
   */
  public int size(){
    return size;
  }
  
  /**
   * inserts the person into the linkedlist depending on integer given
   * Running Time: O(n), one for loop
   * @param i, the integer deciding where the person will be stored
   * @param person, the person to be stored
   */
  public void insert(int i, Person person){
    //incrementing the size of the linkedlist
    size = size + 1;
    //the first insert
    if (front == null){
      front = new LLNode<Person>(person, null);
    }
    else{
      LLNode<Person> nodeptr = front;
      //going up until i
      for (int j = 0; j < i && nodeptr.getNext() != null; j++){
        nodeptr = nodeptr.getNext();
      }
      //inserting the person
      nodeptr.setNext(new LLNode<Person>(person, nodeptr.getNext()));
    }
  }
  
  /**
   * finds a person based on i
   * Running Time: O(n), one for loop
   * @param i, the integer deciding which person we want
   * @return the person at the integer
   */
  public Person lookup(int i) {
    //throwing exception if i is bigger than the size
    if (i > size())
      throw new NoSuchElementException();
    else{
      LLNode<Person> nodeptr = front; 
      //running until the desired person
      for (int j = 0; j < i; j++){
        nodeptr = nodeptr.getNext();
      }
      //returning the desired person
      return nodeptr.getElement();
    }
  }
  
  /**
   * removes a person at the ith component and returns that person
   * Running Time: O(n), one for loop
   * @param i, the integer deciding which person we want to remove
   * @return the person that we removed
   */
  public Person remove(int i){
    //decrementing the size
    size = size - 1;
    if (i > size())
      return null;
    else{
      LLNode<Person> nodeptr = front;
      for (int j = 0; j < i - 1; j++){
        nodeptr = nodeptr.getNext();
      }
      //getting the person at the ith component
      Person temperson = nodeptr.getNext().getElement();
      //reducing the linkedlist size
      nodeptr.setNext(nodeptr.getNext().getNext());
      return temperson;
    }
  }
  
  /**
   * gets all the phonenumbers stored in the FBLinkedList
   * Running Time: O(n), one for loop
   * @return the array of all the phone numbers
   */
  public long[] getNumbers(){
    long[] output = new long[size()];
    LLNode<Person> nodeptr = front;
    //running through the linkedlist and assigning the phonenumbers to the array
    for (int j = 0; j < size(); j++){
      output[j] = nodeptr.getElement().getPhone();
      nodeptr = nodeptr.getNext();
    }
    return output;
  }
}

