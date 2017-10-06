/**
 * A class that is a demo application of the FBList
 * @author Isaac Ng
 */
public class Demo{
  
  /**
   * finds the number of people that have the same prefix as the one entered
   * Running Time: O(n), one for loop
   * @param list, the FBList to obtain phone numbers to compare to the prefix
   * @param prefix, the prefix that we are looking for, assuming 3 digits 
   * @return the number of people who have that prefix
   */
  public static long localsToNum(FBList list, int prefix){
    //obtaining the numbers from the list
    long[] match = list.getNumbers();
    int count = 0;
    for (long i:match){
      //assuming phonenumber is 10 digits, incrementing if prefix found
      if (i/10000000 == prefix)
        count++;
    }
    return count; 
  }
  
  /**
   * main method
   * */
  public static void main(String[] args){
    FBList list = new FBLinkedList();
    list.insert(0, new Person("Bill", 3038029999L));
    list.insert(3, new Person("Nikil", 3038029999L));
    list.insert(1, new Person("Isaac", 7208029999L));
    list.remove(1);
    long count = localsToNum(list, 303);
    System.out.println(count);
    list = new FBArrayList();
    list.insert(0, new Person("Bill", 3038029999L));
    list.insert(3, new Person("Nikil", 3038029999L));
    list.insert(1, new Person("Isaac", 7208029999L));   
    list.remove(1);
    count = localsToNum(list, 303);
    System.out.println(count);
  }
}