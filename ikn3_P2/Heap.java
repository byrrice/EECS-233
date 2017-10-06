import java.util.*;
public class Heap<E extends Comparable<E>> {
  //creating the heap using arraylist
  private ArrayList<E> list = new ArrayList<E>();

  //creating the heaps
  public Heap() {
  }

  //initialize heap using objects
  public Heap(E[] array) {
    for (int i = 0; i < array.length; i++)
      add(array[i]);
  }

  //adding object to heap
  public void add(E element) {
    //add it to the heap
    list.add(element); 
    //shift the index up
    int index = list.size() - 1; 
    
    //To mimic a tree, need to swap objects around
    while (index > 0) {
      int parent = (index - 1) / 2;
      //swaps if the object is greater than its parent
      if (list.get(index).compareTo(list.get(parent)) > 0) {
        E temp = list.get(index);
        list.set(index, list.get(parent));
        list.set(parent, temp);
      }
      else
        break; 
      index = parent;
    }
  }

  //removing an element from the heap
  public E remove() {
    //if size is 0 can't remove anything
    if (list.size() == 0) 
      return null;

    E removed = list.get(0);
    list.set(0, list.get(list.size() - 1));
    list.remove(list.size() - 1);

    int index = 0;
    while (index < list.size()) {
      int leftindex = 2 * index + 1;
      int rightindex = 2 * index + 2;

      //find the max of the to children
      if (leftindex >= list.size()) 
        break; 
      int max = leftindex;
      if (rightindex < list.size()) {
        if (list.get(max).compareTo(list.get(rightindex)) < 0) {
          max = rightindex;
        }
      }

      // Swap if the node is less than the maximum
      if (list.get(index).compareTo(list.get(max)) < 0) {
        E temp = list.get(max);
        list.set(max, list.get(index));
        list.set(index, temp);
        index = max;
      }
      else
        break; 
    }

    return removed;
  }

  //get the size of the arraylist
  public int getSize() {
    return list.size();
  }
}