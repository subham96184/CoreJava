
// Java Program to implement input 
// using Command line argument 
import java.io.*; 
class GFC { 
	public static void main(String[] args) 
	{ 
		// check if length of args array is 
		// greater than 0 
		if (args.length > 0) { 
			System.out.println( 
				"The command line arguments are:"); 
			// iterating the args array and printing 
			// the command line arguments 
			for (String val : args) 
				System.out.println(val); 
		} 
		else
			System.out.println("No command line "
							+ "arguments found."); 
	} 
} 
// Use below commands to run the code 
// javac GFG.java 
// java Main GeeksforGeeks
