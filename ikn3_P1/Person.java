/**
 * A class that represents a person to be put in our phonebook
 * @author Isaac Ng
 */
public class Person{
  
  //the person's name
  private String personID;
  
  //their phone number
  private long phoneNum;
  
  /**
   * the constructor
   * @param personID, their name
   * @param phoneNum, the phone number
   */
  public Person(String personID, long phoneNum){
    this.personID = personID;
    this.phoneNum = phoneNum;
  }
  
  /**
   * gets the phone number of the person
   * @return the phone number
   */
  public long getPhone(){
    return phoneNum;
  }
  
  /**
   * gets the name of the person
   * @return the person's name
   */
  public String getID(){
    return personID; 
  }
}
