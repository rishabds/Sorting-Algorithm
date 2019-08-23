import java.util.Scanner;

/**
 * 
 */

/**
 * @author Rishab Dussoye
 *
 */
public class Selection_Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		Selection_Sort_Class ob = new Selection_Sort_Class(); 
		int a,b,c,d,e;
		Scanner myKey = new Scanner(System.in);
		System.out.print("Enter the 1st digit:");
		a = myKey.nextInt();
		System.out.print("Enter the 2nd digit:" );
	    b =  myKey.nextInt();
		System.out.print("Enter the 3rd digit:" );
		c =  myKey.nextInt();
		System.out.print("Enter the 4th digit:" );
		d =  myKey.nextInt();
		System.out.println("Enter the 5th digit:" );
		e =  myKey.nextInt();
        int arr[] = {a,b,c,d,e}; 
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 

	}

}
