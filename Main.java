import java.util.Scanner;
/**
 * count down until the number the user inputs
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // declare the variable
    int downTo;
    do{
      System.out.println("What number would you like to count down to?");
      downTo = input.nextInt();
    }while(downTo <= 0);

    // create a variable to keep track of the number
    int count = 100;
    // using a loop to count down to user's number
    while(count >= downTo){
      System.out.println(count);
      // decrease the value of the count by five
      count = count - 5;
    }

    
  }
}
