// main program to drive org chart
import java.util.ArrayList;
public class OrgChart
{
  public static void main(String[]args)
  {
  Employee emp1 = new Employee("Zayn", "Malik", 21, 1500.0, 35, "Singer");
  Employee emp2 = new Employee("Louis", "Tomlinson", 22, 1300.0, 35, "Singer");
  Employee emp3 = new Employee("Niall", "Horan", 20, 1200.0, 35, "Potato");
  Employee emp4 = new Employee("Harry", "Styles", 20, 2000.0, 48, "Pussy Cat");
  Employee emp5 = new Employee("Liam", "Payne", 21, 1700.0, 35, "Pain Train");
  ArrayList<Employee> directReports = new ArrayList<Employee>();
  directReports.add(emp1);
  directReports.add(emp2);
  directReports.add(emp3);
  directReports.add(emp4);
  directReports.add(emp5);
  
  ArrayList<Employee> directReport1 = new ArrayList<Employee>();
    
  Manager man1 = new Manager("Simon", "Cowell", 21, 65.0, 35, "PSY-mon", directReports, "Dept. of National Security");
  Manager man2 = new Manager("Taylor", "Swift", 25, 50.0, 48, "Girlfriend", directReport1, "Tay-Vengers");
  
  System.out.println(man1.toString());
  System.out.println("\t"+emp1.toString());
  System.out.println("\t"+emp2.toString());
  System.out.println("\t"+emp3.toString());
  System.out.println("\t"+emp4.toString());
  System.out.println("\t"+emp5.toString());
  
  System.out.println();
  System.out.println(man2.toString());
  System.out.println("\tNo employees, currently");
  System.out.println();
  directReport1.add(emp4);
  directReports.remove(emp4);
  emp5.setJobTitle("Boyfriend/Publicity Event");
  
  System.out.println(man1.toString());
  System.out.println("\t"+emp1.toString());
  System.out.println("\t"+emp2.toString());
  System.out.println("\t"+emp3.toString());
  System.out.println("\t"+emp5.toString());
  
  System.out.println(man2.toString());
  emp4.setJobTitle("Boyfriend");
  System.out.println("\t"+emp4.toString());
  }
}
  
  
  
 
    
