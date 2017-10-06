/**
 * A class to represent a node in a linkedlist
 * @author Isaac Ng
 */
public class LLNode<T> {
  // the element in the node
  private T element;
  
  //the next node
  private LLNode<T> next;
  
  /**
   * the constructor
   * @param element the thing stored in the node
   * @param next next node of the list 
   */
  public LLNode(T element, LLNode<T> next) {
    this.element = element;
    this.next = next;
  }
  
  /**
   * Returns the element stored in the node
   * @return the element stored in the node
   */
  public T getElement() {
    return element;
  }
  
  /**
   * Returns the next node of the list
   * @return next the next node of the list
   */
  public LLNode<T> getNext() {
    return next;
  }
  
  /**
   * sets the next node
   * @param next the node to be set to next
   */
  public void setNext(LLNode<T> next) {
    this.next = next;
  }
  
  
  /**
   * inserts new node after
   * @param element  the value to store in the new node
   */
  public void insertAfter(T element) {
    setNext( new LLNode<T>(element, getNext()));
  }
  
  /**
   * removes the next node
   */
  public void deleteNext() {
    if(getNext() != null){
      setNext( getNext().getNext());
    }
  }
  
}