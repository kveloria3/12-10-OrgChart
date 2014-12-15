// Super Class to represent a person
public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  
  //constructor
  public Person(String first, String last, int a)
  {
    firstName = first;
    lastName = last;
    age = a;
  }
  
  //accessors
  public String getFirstName()
  {
    return firstName;
  }
  public String getLastName()
  {
    return lastName;
  }
  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    String s = lastName+", "+firstName;
    return s;
  }
  
  //mutators
  public void recordBirthday()
  {
    age++;
  }
}
