//list interface 

import java.util.ArrayList;

public class ListInterface {
    
  public static void main(String[] args) {
      
    ArrayList<String> students = new ArrayList<String>();
    
    
    students.add("John");
    students.add("Jane");
    students.add("Doe");
    
    System.out.println(students.get(1));
    // Jane
    
  }
}
