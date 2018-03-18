package pascalsTrianglewithJunit;

public class PascalsTriangle {
     
    
    public  void printPascalsTriangle(int numRows)
    {
         
      // Iterate through every line
      // and print entries in it
      for (int line = 0; line < numRows; line++)
      {
        // Every line has number of 
        // integers equal to line number
    	  for(int space=0;space<=numRows-line;space++) System.out.print(" ");
    	  System.out.print("[ ");
        for (int i = 0; i <= line; i++)
          System.out.print(BinominalCoef(line, i)+" ");
                         
        System.out.print("]\n");
      }
    }
      
    // Link for details of this function
    // https://www.geeksforgeeks.org/archives/25621
   public  int BinominalCoef(int n, int k)   //n=1, k=1
    {
        int res = 1;
         
        if (k > n - k)
           k = n - k;
            
        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
      
    // Driver code
   
}