public class pattern
{
    public static void main(String[] args)
    {
      int i,k,j,n=10;
      for(i=0;i<n;i++)
      {
          //spaces
          for(j=0;j<n-i;j++)
          {
              System.out.println(" ");
          }
            System.out.println("*");
          if(i!=0)
          {    //spaces
              for(j=0;j<2*i-1;j++)
              {
                  System.out.println(" ");
              }
              System.out.println("*");
          }
          //bottom
          for(i=0;i<n-1;i++)
          {
              for(j=0;j<i+1;j++)
              {
                  System.out.println(" ");
              }
              System.out.println("*");
              if(i!=n-2){
                  for(j=0;j<2*(n-i)-5;j++){
                      System.out.println(" ");
                  }
                  System.out.println("*");
              }
          }
      }
    }
}
