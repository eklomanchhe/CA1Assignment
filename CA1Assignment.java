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
 */
/**
 *
 * @author Shivakoti Anil
 */
import java.util.*;
import java.util.Scanner;
import java.math.*;


public class CA1Assignment {
	public static void main(String[] args) {
		Scanner inputNumber = new Scanner(System.in);
		int typeNumber;

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
		
		// Declaring to hit "ENTER" button to go to main programm
		System.out.println();
		System.out.print(".-'-...-'-...-'-. Press the [ ENTER ] key to continue .-'-...-'-...-'-.");
		
		// moving to next line
		inputNumber.nextLine();
		
		System.out.println();
		System.out.println("********************************************************************");
		System.out.println("     Please Choose From One Of The Following to Get the Result:");
		System.out.println("********************************************************************");
		boolean valid = false;
		while (!valid){
			System.out.println();
			displayMenu();
			
			try {
				
				typeNumber = inputNumber.nextInt();
				
				if (typeNumber == 1) {
						LengthOfLine();
					}
				
				
				else if(typeNumber == 2){
					SlopeOfLine();				
				}
				
				else if(typeNumber == 3){
					MidPointOfLine();
				}
				
				else if(typeNumber == 4){
					EquationOfLine();
				}
				
				else if(typeNumber == 5) {
					System.out.println("\n********************************************************************");
					System.out.println("You have choosen [Option 5] For:");
					System.out.println("-> TO EXIT FROM MY PROGRAM, THANX FORA USING ME <-\n");
					System.out.println("SHIAVAKOTI ANIL \nCCT College \nStudent Number: 2014382 ");
					System.out.println("********************************************************************");
					
					
					System.out.println("\n\nTHANX For Using My Coordinate Geometry Calculator");
					valid = true;
				}
				else {
					valid = false;
					System.out.println("\nOopsies...!!! Your Input Number seems to be Invalid, Once More Please...");
				}
				
			}
			catch (InputMismatchException e) {
				System.out.println("Sorry!!! You Typed String / Alphabet, Try Using Number ;)");
				
				inputNumber.nextLine();
			}

			
		}
		System.out.println();

				
	}

		public static void displayMenu(){
		// MENU DISPLAY
		System.out.println();
		System.out.println("::> [1] - Length of a line");
		System.out.println("::> [2] - Slope of a Line");
		System.out.println("::> [3] - Midpoint of a line");
		System.out.println("::> [4] - Equation of a line");
		System.out.println("::> [5] - Exit");
		System.out.println();
		System.out.print("Please, Enter a Number Between 1 to 5: ");

	}
	
	
	
	public static void LengthOfLine() {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 1] For:");
		System.out.println("-> Formula Of Length of a Line(d) = Sq.Root[(x2-x1)^2 + (y2-y1)^2]\n");
		System.out.println("********************************************************************");
		
		boolean valid = false;
		
		while(!valid){
			try {
				System.out.print("\nPlease Enter Number For x1: ");
				double numX1 = inputNumber.nextDouble();
				
				System.out.print("Please Enter Number For y1: ");
				double numY1 = inputNumber.nextDouble();
				
				System.out.print("Please Enter Number For x2: ");
				double numX2 = inputNumber.nextDouble();
				
				System.out.print("Please Enter Number For y2: ");
				double numY2 = inputNumber.nextDouble();
				
				System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
				double calculation = Math.sqrt(Math.pow(numX2-numX1,2) +Math.pow(numY2-numY1,2));
				
				System.out.println("And the Length of the line is: [" +calculation +"]" );
				
				return;


			}
			catch (InputMismatchException e) {
				System.out.println("One of your entry seems alphabet, Lets try Again");
				inputNumber.next();
			   }

		}
		System.out.println("Do Again");
	}
	
	public static void SlopeOfLine() {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 2] For:");
		System.out.println("-> Formula Of Slope of a Line(m) = (y2-y1)/(x2-x1)\n");
		System.out.println("********************************************************************");
		
		System.out.print("\nPlease Enter Number For x1: ");
		double numX1 = inputNumber.nextDouble();
		
		System.out.print("Please Enter Number For y1: ");
		double numY1 = inputNumber.nextDouble();
		
		System.out.print("Please Enter Number For x2: ");
		double numX2 = inputNumber.nextDouble();
		
		System.out.print("Please Enter Number For y2: ");
		double numY2 = inputNumber.nextDouble();
		
		System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
		
		
		double calculation;
		calculation = (numY2-numY1)/(numX2-numX1);
		
		System.out.println("And the Slope of the line is: [" +calculation +"]" );

		
	}
	
	public static void MidPointOfLine() {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 3] For:");
		System.out.println("-> Formula Of Mid-Point of a Line(x, y) = [ ((x1+x2)/2), ((y1+y2)/2) ]\n");
		System.out.println("********************************************************************");
		
		
		System.out.print("\nPlease Enter Number For x1: ");
		double numX1 = inputNumber.nextDouble();
		
		System.out.print("Please Enter Number For y1: ");
		double numY1 = inputNumber.nextDouble();
		
		System.out.print("Please Enter Number For x2: ");
		double numX2 = inputNumber.nextDouble();
		
		System.out.print("Please Enter Number For y2: ");
		double numY2 = inputNumber.nextDouble();
		
		
		System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
		
		
		double calculationX, calculationY;
		calculationX = ((numX1 + numX2) / 2);
		calculationY = ((numY1 + numY2) / 2);
		
		System.out.println("And the mid-point of the line [x, y] is: [ " +calculationX +" , " +calculationY +" ]" );

		
	}
	
	
	public static void EquationOfLine() {
		Scanner inputNumber = new Scanner(System.in);
		System.out.println("\n********************************************************************");
		System.out.println("You have choosen [Option 4] For:");
		System.out.println("-> Formula Of Equation Of a Line is ax+by+c=0\n");
		System.out.println("********************************************************************");
		
		
		System.out.print("\nPlease Enter Number For x1: ");
		int numX1 = inputNumber.nextInt();
		
		System.out.print("Please Enter Number For y1: ");
		int numY1 = inputNumber.nextInt();
		
		System.out.print("Please Enter Number For x2: ");
		int numX2 = inputNumber.nextInt();
		
		System.out.print("Please Enter Number For y2: ");
		int numY2 = inputNumber.nextInt();
		
		
		System.out.println("\nYour Numbers and values are: \n x1 = " +numX1 +" , y1 = " +numY1 +"\n x2 = " +numX2 +" , y2 = " +numY2);
		
		System.out.println("Where, A = (y1-y2), B = (x2 - x1) and C = (x1y2 - x2y1)");

		
		System.out.println("\nThe Equation of the line is : (" + (numY1 - numY2)
		+ ")x +(" + (numX2 - numX1) + ")y +(" + (numX1 * numY2 - numX2 * numY1) + ") = 0");
		return;
				
	}
	
}


/**
Reference:

http://goobbe.com/questions/6639505/how-do-i-find-y-intercept-with-x1-x2-y1-y2
http://www.reddit.com/r/learnprogramming/comments/2g2lp0/trying_to_write_a_program_to_calculate_slope_of_a/1
http://www.analyzemath.com/line/line.htm 
*/
