// class to represent a manager - inherits Emplyee
import java.util.ArrayList;
public class Manager extends Employee
{
  private ArrayList<Employee> directReports;
  private String department;
  
  public Manager(String first, String last, int a, double wage, int hours, String title, ArrayList<Employee> dR, String dept)
  {
    super(first, last, a, wage, hours, title);
    directReports = dR;
    department = dept;
  }
  
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReports;
  }
  public String toString()
  {
    String s = "Manager: "+super.toString()+" "+department;
    return s;
  }
  public void addDirectReport(Employee emp1)
  {
    directReports.add(emp1);
  }
  public void removeDirectReport(Employee emp2)
  {
    directReports.remove(emp2);
  }
  public void setDepartment(String dept)
  {
    department = dept;
  }
}

  
