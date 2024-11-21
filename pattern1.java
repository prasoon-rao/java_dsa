public class pattern1
{
    public static void main(String args[])
    {
       int n=5;
       int i,j;
       int st=n,sp=0;
       for (i=1;i<=n;i++)
       {
           for (j=1;j<=sp;j++)
           {
            System.out.print("\t");
           }
           for (j=1;j<=st;j++)
           {
            System.out.print("*\t");

           }
           st--;
           sp++;
           System.out.println();
           
       }
    }
}