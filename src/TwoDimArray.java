
public class TwoDimArray {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};	// An array of integer array, each row is an array of integers
	
	public static void main(String[] args) {
		printArray(myArray);
		System.out.println();
		printArrayEven(myArray);
		int[][] myFileArray = fillArray("twodimension.txt");
		printArray(myFileArray);
		System.out.println();
		printArrayEven(myFileArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {		// rows, theArray.length == # of arrays stored in the array of arrays
			for (int j=0; j<theArray[i].length;j++)		//cols, theArray[i].length == the length of the array stored in index i of the array
				display(theArray[i][j]);			// print value at [row][col]
			System.out.println();		// new line between rows
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void displayEven (int num){
		

		if (num % 2 == 0)
			System.out.print(num+" ");
		else
		
		System.out.print("* ");
	}
	private static void printArrayEven(int[][] theArray){
		for (int i=0; i<theArray.length; i++) {		// rows, theArray.length == # of arrays stored in the array of arrays
			for (int j=0; j<theArray[i].length;j++)		//cols, theArray[i].length == the length of the array stored in index i of the array
			{

				displayEven(theArray[i][j]);			// print value at [row][col]
			}
			System.out.println();		// new line between rows
		}
	}
	
	public static int[][] fillArray(String myFile) // a text file path (absolute or relative) which contains a 2D array 
	{
		TextFileInput readFile = new TextFileInput(myFile);
		int rows = Integer.parseInt(readFile.readLine());
		int cols = Integer.parseInt(readFile.readLine());
		int [][] TwoDimArray = new int[rows][cols];
		
		for(int i =0; i < rows; i++)
		{
			for(int j =0; j < cols; j++) 
			{
				TwoDimArray[i][j] = Integer.parseInt(readFile.readLine());
			}
		}
		
		
		return TwoDimArray;
	}
}