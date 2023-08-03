import java.util.Random;


public class TwoDAverage {

    public static void main(String[] args) {

	int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

	int product = productOfArray(myArray);
	System.out.println("The rpoduct is: " + product);

	int[][] rArray = genRandomArray(3, 3, 20);
	int rproduct = productOfArray(rArray);
	printArray(rArray);
	System.out.println("The rpoduct is: " + rproduct);


    }

    public static void printArray(int[][] theArray) {
	for (int i = 0; i < theArray.length; i++) {
	    for (int j = 0; j < theArray[0].length; j++) {
		System.out.print(theArray[i][j] + " ");
	    }
	    System.out.println();
	}

    }

    public static int[][] genRandomArray(int m, int n, int range) {

	int[][] returnArray = new int[m][n];
	
	Random rnd = new Random();
	for (int i = 0; i < m; i++) {
	    for (int j = 0; j < n; j++) {
		returnArray[i][j] = (rnd.nextInt(range) + 1);
	    }
	}
	return returnArray;
    }

    public static int productOfArray(int[][] theArray) {
	int returnProduct = 1;
	for (int i = 0; i < theArray.length; i++) {
	    for (int j = 0; j < theArray[0].length; j++) {
		returnProduct *= theArray[i][j];
	    }
	}
	return returnProduct;
    }
       

}
