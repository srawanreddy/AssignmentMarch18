package pascalsTrianglewithJunit;

public class PascalsTriangle {
     
    
    public  void printPascalsTriangle(int numRows)
    {
         
            for (int line = 0; line < numRows; line++)
      {
           	  for(int space=0;space<=numRows-line;space++) System.out.print(" ");
    	  System.out.print("[ ");
        for (int i = 0; i <= line; i++)
          System.out.print(BinominalCoef(line, i)+" ");
                         
        System.out.print("]\n");
      }
    }
      
    
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
      
    
   
}
