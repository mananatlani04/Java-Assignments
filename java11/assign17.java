
import java.util.ArrayList;

/* Create a class Employee with(empNo ,salary and totalSalary)  with following features.i

Only parameterized constructor;
totalSalary always represent total of all the salaries of all employees created.
empNo should be auto incremented.
display total employees and totalSalary using class method.*/
class emplist{
    ArrayList <Employee> ei = new ArrayList();
    public void add(Employee e)
    {
        ei.add(e);
    }
    public int calculate()
    {
        int sum = 0;
        for(Employee e: ei)
        {
            sum = sum + e.getSalary();
        }
        return sum;
    }
    public int calculateEmpNo()
    {
        int count = 0;
        for( Employee e : ei)
        {
            count++;
        }
        return count;
    }
}
class Employee
{
    private int empno;
    private int salary;
    private int totalsalary;
    public Employee( int empno, int salary )
    {
        this.empno = empno;
        this.salary = salary;
    }
    public int getEmpno()
    {
        return empno;
    }
    public int getSalary()
    {
        return salary;
    }
    public int getTotalSalary()
    {
        return totalsalary;
    }
    public void display()
    {
        System.out.println("Salary:" + salary + "Totalsalary:" + totalsalary);
    }
}
class Testmain
{
    public static void main(String[] args) 
    {
        emplist ei = new emplist();
        Employee obj1 = new Employee(1,10);
        Employee obj2 = new Employee(2,20);
        Employee obj3 = new Employee(3,30);
        Employee obj4 = new Employee(4,10);
        Employee obj5 = new Employee(5,30);
        emplist ei = new emplist();
        ei.add(obj1);
        ei.add(obj2);
        ei.add(obj3);
        ei.add(obj4);
        ei.add(obj5);
        int sum = ei.calculate();
        int count = ei.calculateEmpNo();
        System.out.println(sum);
        System.out.println(count);
    }
}