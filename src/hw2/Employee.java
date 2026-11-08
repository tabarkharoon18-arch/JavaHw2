

package hw2;
import java.time.LocalDate;
import java .lang.Comparable;
 abstract class Employee implements Taxable, BonusCalculable, Comparable<Employee> {
     private String id ;
     private String name ;
     protected  double baseSalary ;
     private LocalDate joinDate;

    public Employee(String id, String name, double baseSalary, LocalDate joinDate) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.joinDate = joinDate;
    }
    public abstract double calculateNetSalary();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }
    
    @Override
    public int compareTo(Employee other) {
        return Double.compare(other.calculateNetSalary(), this.calculateNetSalary());
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", baseSalary=" + baseSalary + ", joinDate=" + joinDate + '}';
    }

  
    
    
     
}
