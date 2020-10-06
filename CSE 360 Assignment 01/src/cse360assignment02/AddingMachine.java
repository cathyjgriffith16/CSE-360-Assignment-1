/* Catherine Griffith
 * CSE 360
 * Assignment 1 - Version Control
 * Dr. Javier Gonzalez Sanchez
 * Monday, October 5th, 2020
 * This assignment gives us practice using version controls like Github to post our programs. This is the second version.
 * */
package cse360assignment02;

/*A public class with the purpose of adding numbers together. **/
public class AddingMachine {
  /*Allows the class to be loaded into the memory **/
  public static void main(String[] args) {
		AddingMachine myCalculator= new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator);
  }
  
  private int total;
  private String transactionhistory;
  
  /*A default constructor that instantiates the object of the AddingMachine class. 
   * It two variables, which are total and transactionhistory that are equal to 0. **/
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    transactionhistory = "0";
  }
  
  /*A getter method for returning all addition operations
   * Returns sum of the total **/
  public int getTotal () {
    return total;
  }
  
  /*This method adds the value to the total
   *The parameter called value is the amount added to the total
   * Also adds the transactionhistory and value together **/
  public void add (int value) {
	  total = total + value;
	  transactionhistory = transactionhistory + " + " + value;
  }
  
  /*This method subtracts the value to the total
   *The parameter called value is the amount subtracted from the total
   *Also subtracts the transactionhistory and value together **/
  public void subtract (int value) {
	  total = total - value;
	  transactionhistory = transactionhistory + " - " + value;
  }

  /*The output for transactionhistory should return as a String**/
  public String toString () {
    return transactionhistory;
  }

  /*Clears memory and resets to the original values**/
  public void clear() {
	  total = 0;  
	  transactionhistory = "0";
  }
}