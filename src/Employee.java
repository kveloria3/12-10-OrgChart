// class to represent an emplayee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  
  public Employee(String first, String last, int a, double wage, int hours, String title)
  {
    super(first, last, a);
    hourlyWage = wage;
    hoursWorked = hours;
    jobTitle = title;
  }
  
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hourlyWage * hoursWorked;
  }
  public double getYearlySalary()
  {
    return getWeeklySalary() * 52;
  }
  public String getJobTitle()
  {
    return jobTitle;
  }
  public String toString()
  {
    String s = super.toString()+" Job: "+jobTitle+" @ "+getYearlySalary();
    return s;
  }
  
  
  public void setWage(double newWage)
  {
    hourlyWage = newWage;
  }
  public void setHours(int h)
  {
    hoursWorked = h;
  }
  public void setJobTitle(String title)
  {
    jobTitle = title;
  }
  public void giveRaise()
  {
    hourlyWage++;
  }

  
}
