/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex7;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author Desktop Pc
 */
public class strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        list.add(0,"orange");
        list.add(1,"apple");
        list.add(2,"blackberry");
        list.add(3,"guava");
        list.add(4,"blueberrie");
        list.add(5,"apricot");
      //printing the contents in array list
        System.out.println("Display all the string");
        System.out.println(list);
        System.out.println("Search the element=apple"); //searching the string "apple" in the array list         
         if (list.contains("apple"))
         {
             System.out.println("Element Found");
         }  
         else
         {
            System.out.println("Element Not Found"); 
         }
                              
           System.out.println("String that begin and end with (e):");
     for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
 if (str.endsWith("e")||(str.startsWith("e"))) 
 {
 System.out.println(str);

}
     }
    }
}
