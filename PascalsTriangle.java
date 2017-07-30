
public class PascalsTriangle <T> {
	public int k = 0;
	private Object[] pascalsTriangle;
	// Creates a Pascal Triangle object with length 'row' since the nth row is also its length we can hit two birds with one stone 
	// Populates our PascalsTriangle object with the correct values based on binomial theorem
	public PascalsTriangle(int row)
	{
		k = row+1;
		pascalsTriangle = new Object[k];
		for(int i = 0; i < k; i++)
			{
				int column = i;
				int n_k = row-i;
				int cell = factorial(row)/(factorial(i)*factorial(n_k));
				pascalsTriangle[column]= cell;
			}
		}
	// Here we use a recursive method, which is very, very cool to calculate nfactorial 
	public int factorial(int n)
	{
		if (n <= 1) {
	           return 1;
	       } else {
	           return n * factorial(n - 1);
	       }
	}
	// This is just a basic plain vanilla toString() method
	 public String toString()
	   {
	      String result = "";

	      for (int index = 0; index < k; index++) 
	         result += pascalsTriangle[index] + "\n";

	      return result;
	   }

	}
	
