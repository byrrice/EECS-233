import java.util.*;

/**
 * A class to represent the Array implementation of FBList
 * @author Isaac Ng
 */
public class FBArrayList extends FBList{
  
  //the array that stores the persons
  private Person[] array;
  
  /**
   * the constructor, intializes the array 
   */
  public FBArrayList() {
    this.array = new Person[0];
  }
  
  /**
   * Finds the size of the array
   * Running Time: constant, no for loop
   * @return the size of the array
   */
  public int size(){
    return array.length;
  }
  
  /**
   * inserts the person into the array depending on integer given
   * Running Time: O(n), one for loop
   * @param i, the integer deciding where the person will be stored
   * @param person, the person to be stored
   */
  public void insert(int i, Person person){
    
    //the condition that i is bigger than the size of the array
    if (i > size()){
      //build new array that is bigger by 1 element
      Person[] temp = new Person[size()+1];
      for (int j = 0; j < temp.length - 1; j++){
        temp[j] = array[j];
      }
      //add person at end
      temp[temp.length - 1] = person;
      this.array = temp;
    }
    
    // the condition that i = 0
    else if (i == 0){
      //create new array bigger by 1 element
      Person[] temp = new Person[size()+1];
      //assign person to the beginning element
      temp[0] = person;
      //shift everything up
      for (int j = 1; j <= temp.length - 1; j++){
        temp[j] = array[j - 1];
      }
      this.array = temp;
    }
    
    else{
      //build new array that is bigger by 1
      Person[] temp = new Person[size()+1];
      for (int j = 0; j <= temp.length - 1; j++){
        //just assigning values to be the same until insert spot
        if (j < i - 1)
          temp[j]= array[j];
        // insert element here
        else if (j == i -1)
          temp[j] = person;
        //shift everything up after insert
        else
          temp[j] = array[j-1];
      }
    }
  }
  
  /**
   * finds a person based on i
   * Running Time: constant no for loop
   * @param i, the integer deciding which person we want
   * @return the person at the integer
   */
  public Person lookup(int i) {
    //throwing exception if i is bigger
    if (i > size())
      throw new NoSuchElementException();
    //returning the ith component 
    else
      return array[i];
  }
  
  /**
   * removes a person at the ith component and returns that person
   * Running Time: O(n), one for loop
   * @param i, the integer deciding which person we want to remove
   * @return the person that we removed
   */
  public Person remove(int i){
    if (i > size())
      return null;
    else{
      //getting the element at i
      Person temp = array[i];
      //creating new array that is less than the original array by 1
      Person[] temparray = new Person[size()-1];
      for (int j = 0; j <= temparray.length; j++){
        //keep everything the same before i
        if (j < i)
          temparray[j] = array[j];
        //shift everything down after
        else if (j > i)
          temparray[j] = array[j+1];
      }
      this.array = temparray;
      return temp;
    }
  }
  
  /**
   * gets all the phonenumbers stored in the FBArrayList
   * Running Time: O(n), one for loop
   * @return the array of all the phone numbers
   */
  public long[] getNumbers(){
    //new array to store the numbers
    long[] output = new long[size()];
    for (int i = 0; i < size(); i++){
      output[i] = array[i].getPhone();
    }
    return output;
  }
}
