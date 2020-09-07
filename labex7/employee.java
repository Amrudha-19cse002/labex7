package labex7;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.*;
/**
 *
 * @author Desktop Pc
 */
public class employee{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayList<emp> list=new ArrayList<>();
        emp obj[];
        obj=new emp[20];
        for(int i=0;i<20;i++)
        {
            obj[i]=new emp();
            obj[i].get();
        }
          for(int i=0;i<=20;i++)
        {
          
           list.add(obj[i]);
        }
          Collections.sort(list,new salarysort());
           System.out.println("Salary sorted in ascending order");
         System.out.println(list);
         

       
        
    }
    
}
class emp
{
    String name;
    double salary;
   
    void get()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of the employee:");
        name=obj.next();
           System.out.println("Enter the salary of the employee:");
        salary=obj.nextDouble();
    }
     public String toString()
    {
        return "\nName="+name+"\tSalary="+salary;
    }
}
class salarysort implements Comparator<emp>// interface for sorting
{
   public int compare(emp e1,emp e2)
   {
      
       return(int)(e1.salary-e2.salary);// print in ascending order
   }
}