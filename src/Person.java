public class Person
{
  private String firstName;
  private String lastName;
  private int age;
  
  public Person(String first, String last, int a)
  {
    firstName = first;
    lastName = last;
    age = a;
  }
  
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
  
  public void recordBirthday()
  {
    age++;
  }
}
