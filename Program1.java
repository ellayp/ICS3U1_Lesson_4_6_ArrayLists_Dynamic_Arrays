import java.util.ArrayList;
import java.util.Collections;

class Program1 extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    // Declare and create an ArrayList
    ArrayList<String> strCars = new ArrayList<String>();

    // Add elements
    strCars.add("Toyota");
    strCars.add("Honda");
    strCars.add("Acura");
    strCars.add("BMW");
    
    // Print ArrayList
    System.out.println("Full ArrayList:");
    System.out.println(strCars);
    System.out.println("");

    // Access elements
    System.out.println("Value of element at Index 1:");
    System.out.println(strCars.get(1));
    System.out.println("");
    
    // Change elements
    strCars.set(3, "Tesla");
    System.out.println("Changing the last element:");
    System.out.println(strCars);
    System.out.println("");
    
    // Remove elements
    strCars.remove(2);
    System.out.println("Removing the value of element at Index 2 (Acura):");
    System.out.println(strCars);
    System.out.println("");
    
    // Add elements to a specific position
    strCars.add(1, "Lexus");
    System.out.println("Adding 'Lexus' as the second element (index 1):");
    System.out.println(strCars);
    System.out.println("");
    
    // Getting the Length of an ArrayList
    System.out.println("The size of strCars ArrayList is:");
    System.out.println(strCars.size());
    System.out.println("");
    
    // Iteration using Traditional For Loop
    System.out.println("Printing every element using a for loop:");
    for (int i = 0; i < strCars.size(); i++) {
      System.out.println(strCars.get(i));
    }
    System.out.println("");
    
    // Iteration using for-each loop
    System.out.println("Printing every element using a for-each loop:");
    for (String car:strCars) {
      System.out.println(car);
    }
    System.out.println("");
    
    // Sorting ArrayList using Collections library and sort()
    Collections.sort(strCars);
    System.out.println("Sorted ArrayList:");
    System.out.println(strCars);
  }
}
