/**
 * cvakotianil@gmail.com
				\\\//
			  / _ _ \
			 (|(.)(.)|)
	----.OOOo--()--oOOO.———
			ANIL SHIVAKOTI
			Eklo Manchhe
			cvakotianil@gmail.com
	----.ooo0-----------------
		  (   )    0ooo.
			\ (     (   )
			\_)     ) /
					(_/
* Created by Anil Shivakoti
* Student Number	: 	2014382
* College			:	CCT 
*/
/**
 *
 * @author Shivakoti Anil
 * JAVA files are created by using Code Runner(Version 2.0.1) for MAC Book (Apple)
 * All the references are listed at buttom of the codes, some of the codes are taken from websites as reference but not used as copy paste.
 * This Program is successfully compiled by different Java compiler: NetBeans, Eclipse, Dr. Java .
 */

// imports everything within java.util including Scanner and Exception.
import java.util.*;

// starting of main class file
public class CA1Assignment {
	// starting main method
	public static void main(String[] args) {
		
		//printing message to the screen
		System.out.println("::: Welcome to My JAVA Projetcs For Coordinate Geometry Calculator :::");
		System.out.println("--- This is MY Private work if u have any questions then I'm here ---");
		
		System.out.println("          --------------------------------------------");
		System.out.println("          *                     _  _                 *");
		System.out.println("          *                  (|(.)(.)|)              *");
		System.out.println("          *         ----.OOOo--()--oOOO.-----        *");
		System.out.println("          *                ANIL SHIVAKOTI            *");
		System.out.println("          *            cvakotianil@gmail.com         *");
		System.out.println("          *            PH - +353 - 879148859         *");
		System.out.println("          *------------------------------------------*");
		
		// Declaring to hit "ENTER" button to go to main program
		System.out.println();
		System.out.print(".-'-...-'-...-'-. Press the [ ENTER ] key to continue .-'-...-'-...-'-.");
		
		// after hitting enter (with any text or number) moving to next line
		
		System.out.println();
		System.out.println("********************************************************************");
		System.out.println("     Please Choose From One Of The Following to Get the Result:");
		System.out.println("********************************************************************");
		System.out.println();
		
		// calling displayMenu Method to  take action
		displayMenu();
				
	}
	
	// declaring new method for to display menu of the program
	private static void displayMenu(){
		//defining scanner
		Scanner inputNumber = new Scanner(System.in);
		int typeNumber;				// declaring Integer
		boolean valid = false;		//declaring boolean value for taking action to wrong entered options
		while (!valid){
			System.out.println();	// printing blank text to make suitable space between options 
			
			// starting of try and catch method to detect pressed key is not alphabet
			try {
				// printing and declaring option with number for each actions
				System.out.println("::> [1] - Length of a line");
				System.out.println("::> [2] - Slope of a Line");
				System.out.println("::> [3] - Midpoint of a line");
				System.out.println("::> [4] - Equation of a line");
				System.out.println("::> [5] - Exit");
				System.out.println();
				System.out.print("Please, Enter a Number Between 1 to 5: ");
				typeNumber = inputNumber.nextInt();		// defining to type an Integer
				
				// declaring if else actions for typed options, if numbers are not equal to 1-5 the gives a alert
				if (typeNumber == 1) {
						LengthOfLine(inputNumber);	// if typed 1 then goes then frequently take actions defined in LengthOfLine Method
					}
				
				
				else if(typeNumber == 2){			// if typed 2 then goes then frequently take actions defined in SlopeOfLine Method
					SlopeOfLine(inputNumber);				
				}
				
				else if(typeNumber == 3){			// if typed 3 then goes then frequently take actions defined in MidPointOfLine Method
					MidPointOfLine(inputNumber);
				}
				
				else if(typeNumber == 4){			// if typed 4 then goes then frequently take actions defined in EquationOfLine Method
					EquationOfLine(inputNumber);
				}
				
				else if(typeNumber == 5) {			// if typed 5 then goes then exists from the program with defined message
					System.out.println("\n********************************************************************");
					System.out.println("You have choosen [Option 5] For:");
					System.out.println("-> TO EXIT FROM MY PROGRAM, THANX FORA USING ME <-\n");
					System.out.println("SHIAVAKOTI ANIL \nCCT College \nStudent Number: 2014382 ");
					System.out.println("********************************************************************");					
					System.out.println("\n\nTHANX For Using My Coordinate Geometry Calculator");
					
					System.exit(0);		// exits from the program
				}
				else {
					// if pressed Number is not valid then gives defined alert to the user
					valid = false;
					System.out.println("\nOopsies...!!! Your Input Number seems to be Invalid, Once More Please...");
				}
				
			}
			// if pressed key is alphabet then gives alert with defined message
			catch (InputMismatchException e) {
				System.out.println("Sorry!!! You Typed String / Alphabet, Try Using Number ;)");
				inputNumber.nextLine();		// moving to next line
			}

			
		}
		// blank message
		System.out.println();
	}// closing method
	
	// starting of another method with Scanner; for user if they would like to perform another calculation. If yes goes to menu screen again, if no, the program exits
	private static void exitSystem(Scanner inputNumber){
		int typeNumber;					// defining Integer
			boolean valid = false;		// declaring boolean with value
			while (!valid){
				System.out.println();	// blank message
				// start of try and catch method
				try {
					// printing message after user complete every task from menu
					System.out.println("Do you want To Go Back to Main MENU???"); 
					System.out.println("Yes(Go to Main Menu) => [1]"); 
					System.out.println("No(Exit the System)  => [2]");
					System.out.print("Please Type Number [1 or 2]: ");
					typeNumber = inputNumber.nextInt();		// declaring to type integer
					
					// defining if else method, if pressed 1 goes back to main menu if pressed 2 exits from the program, otherwise gives alert
					if (typeNumber == 1) {
						System.out.println("\n********************************************************************");
						System.out.println("You are in Main Menu Now\nPlease follow the Instructions to get the result"); 
						System.out.println("********************************************************************");
						displayMenu();		// calling method to take action

						}
					
					else if(typeNumber == 2){
						System.out.println("\n********************************************************************");
						System.out.print("THANX For Using My Coordinate Geometry Calculator");
						System.out.print("\nSHIAVAKOTI ANIL \nCCT College \nStudent Number: 2014382 \n");
						System.out.print("********************************************************************");
						System.exit(0); 	// exit from the program 
					}
					
					else {
						// defining whether input value is true or not with message
						valid = false;
						System.out.println("\nOopsies...!!! Your Input Number seems to be Invalid, Once More Please...");
							}
							
						}
				// defining to give alert if input is Alphabet		
				catch (InputMismatchException e) {
							System.out.println("Sorry!!! You Typed String / Alphabet, Try Using Number ;)");
							inputNumber.nextLine();		// next line
						}
					}
					System.out.println();			// blank message
	}// closing method
	
	
	// starting method with scanner to measure Length of a line from 4 co-ordinates
	private static void LengthOfLine(Scanner inputNumber) {
		// defining message to display
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 1] For:");
		System.out.println("-> Formula Of Length of a Line(d) = Sq.Root[(x2-x1)^2 + (y2-y1)^2]\n");
		System.out.println("********************************************************************");
		
		boolean valid = false;		// declaring boolean with value
		
		while(!valid){
			
			// start of try and catch method
			try {
				System.out.print("\nPlease Enter Number For x1: "); 	// printing message to type first Number
				double numX1 = inputNumber.nextDouble();				// declare to type Number
		
				System.out.print("Please Enter Number For y1: ");		// printing message to type Second Number
				double numY1 = inputNumber.nextDouble();				// declare to type Number
		
				System.out.print("Please Enter Number For x2: ");		// printing message to type Third Number
				double numX2 = inputNumber.nextDouble();				// declare to type Number
		
				System.out.print("Please Enter Number For y2: ");		// printing message to type Forth Number
				double numY2 = inputNumber.nextDouble();				// declare to type Number
				
				
				// defining and printing message to show all pressed four Numbers
				System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
				
				// defining formula of Length of a line
				double calculation = Math.sqrt(Math.pow(numX2-numX1,2) +Math.pow(numY2-numY1,2));
				
				// printing the result
				System.out.println("And the Length of the line is: [" +calculation +"]" );
				
				exitSystem(inputNumber);		// calling the method to take action
			}
			
			// Alert for if input or pressed key is Alphabet with message
			catch (InputMismatchException e) {
				System.out.println("One of your entry seems alphabet, Lets try Again");
				inputNumber.next();		// defining to type Number
			   }

		}
		System.out.println();
	}		//closing method of length of a line
	
	// starting method with scanner to measure Slope of a line from 4 co-ordinates
	private static void SlopeOfLine(Scanner inputNumber) {
		// defining message to display
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 2] For:");
		System.out.println("-> Formula Of Slope of a Line(m) = (y2-y1)/(x2-x1)\n");
		System.out.println("********************************************************************");
		
		boolean valid = false;		// declaring boolean with value
		
		while(!valid){
			
			// start of try and catch method
			try {
				System.out.print("\nPlease Enter Number For x1: "); 	// printing message to type first Number
				double numX1 = inputNumber.nextDouble();				// defining double and declare to type Number
		
				System.out.print("Please Enter Number For y1: ");		// printing message to type Second Number
				double numY1 = inputNumber.nextDouble();				// defining double and  declare to type Number
		
				System.out.print("Please Enter Number For x2: ");		// printing message to type Third Number
				double numX2 = inputNumber.nextDouble();				// defining double and  declare to type Number
		
				System.out.print("Please Enter Number For y2: ");		// printing message to type Forth Number
				double numY2 = inputNumber.nextDouble();				// defining double and  declare to type Number
			
				
				// defining and printing message to show all pressed four Numbers
				System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
		
				// defining formula for Slope of a line
				double calculation;
				calculation = (numY2-numY1)/(numX2-numX1);
				
				// printing the result with defined message
				System.out.println("And the Slope of the line is: [" +calculation +"]" );
				
				exitSystem(inputNumber);		// calling the method to take action
				}
				
			// Alert for if input or pressed key is Alphabet with message
			catch (InputMismatchException e) {
				System.out.println("One of your entry seems alphabet, Lets try Again");
				inputNumber.next();			// defining to type Number
			   }

		}
		System.out.println();
	}		//closing method of slope of a line
	
	// starting method with scanner to measure Mid-Point of a line from 4 co-ordinates
	private static void MidPointOfLine(Scanner inputNumber) {
		// defining message to display
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 3] For:");
		System.out.println("-> Formula Of Mid-Point of a Line(x, y) = [ ((x1+x2)/2), ((y1+y2)/2) ]\n");
		System.out.println("********************************************************************");
		
		boolean valid = false;		// declaring boolean with value
		while(!valid){
			
			// start of try and catch method
			try {
		
				System.out.print("\nPlease Enter Number For x1: "); 	// printing message to type first Number
				double numX1 = inputNumber.nextDouble();				// defining double and  declare to type Number
		
				System.out.print("Please Enter Number For y1: ");		// printing message to type Second Number
				double numY1 = inputNumber.nextDouble();				// defining double and  declare to type Number
		
				System.out.print("Please Enter Number For x2: ");		// printing message to type Third Number
				double numX2 = inputNumber.nextDouble();				// defining double and  declare to type Number
		
				System.out.print("Please Enter Number For y2: ");		// printing message to type Forth Number
				double numY2 = inputNumber.nextDouble();				// defining double and  declare to type Number
		
				
				// defining and printing message to show all pressed four Numbers
				System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
		
				// defining formula of findin X-coordinate and Y-coordinate to calculate midpoint of a line
				double calculationX, calculationY;
				calculationX = ((numX1 + numX2) / 2);
				calculationY = ((numY1 + numY2) / 2);
		
				System.out.println("And the mid-point of the line [x, y] is: [ " +calculationX +" , " +calculationY +" ]" );
				exitSystem(inputNumber);		// calling the method to take action
				}
				
			// Alert for if input or pressed key is Alphabet with message
			catch (InputMismatchException e) {
				System.out.println("One of your entry seems alphabet, Lets try Again");
				inputNumber.next();		// defining to type Number
			   }

		}
		System.out.println();
		
	}		//closing method of midpoint of a line
	
	// starting method with scanner to measure Equation of a line from 4 co-ordinates
	private static void EquationOfLine(Scanner inputNumber) {
		// defining message to display
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 4] For:");
		System.out.println("-> Formula Of Equation Of a Line is ax+by+c=0\n");
		System.out.println("********************************************************************");
		
		boolean valid = false;		// declaring boolean with value
		while(!valid){
			
			// start of try and catch method
			try {

			System.out.print("\nPlease Enter Number For x1: ");		// printing message to type First Number
			int numX1 = inputNumber.nextInt();						// defining integer and declaring to type Number
		
			System.out.print("Please Enter Number For y1: ");		// printing message to type Second Number
			int numY1 = inputNumber.nextInt();						// defining integer and declaring to type Number
		
			System.out.print("Please Enter Number For x2: ");		// printing message to type Third Number
			int numX2 = inputNumber.nextInt();						// defining integer and declaring to type Number
			
			System.out.print("Please Enter Number For y2: ");		// printing message to type Forth Number
			int numY2 = inputNumber.nextInt();						// defining integer and declaring to type Number
		
			
			// defining and printing message to show all pressed four Numbers
			System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
		
			System.out.println("Where, A = (y1-y2), B = (x2 - x1) and C = (x1y2 - x2y1)");

			// defining formula and message to get the result of equation of a line.
			System.out.println("\nThe Equation of the line is : (" + (numY1 - numY2)+ ")x +(" + (numX2 - numX1) + ")y +(" + (numX1 * numY2 - numX2 * numY1) + ") = 0");
			
			exitSystem(inputNumber);			// calling the method to take action
			}
			// Alert for if input or pressed key is Alphabet with message
			catch (InputMismatchException e) {
				System.out.println("One of your entry seems alphabet, Lets try Again");
				inputNumber.next();		// defining to type Number
			   	}
			}
	}		//closing method of equation of a line
} 		// closing of main method


/**
Reference:

http://goobbe.com/questions/6639505/how-do-i-find-y-intercept-with-x1-x2-y1-y2
http://www.reddit.com/r/learnprogramming/comments/2g2lp0/trying_to_write_a_program_to_calculate_slope_of_a/1
http://www.analyzemath.com/line/line.htm 
http://stackoverflow.com/questions/6920025/how-do-i-close-a-java-application-from-the-code
*/
