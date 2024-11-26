public class pattern2 {
    public static void main (String args[])
    {
        int i,j,n=5;
        for (i=0;i<=n;i++)
        {
            for (j=0;j<=n;j++)
            {
                if(i==j)
                
                    System.out.print("*\t");
                
                else 
                
                    System.out.print("\t");
                
            }
            System.out.println();
         }
        
    }
    
}
