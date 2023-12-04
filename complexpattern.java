public class complexpattern {

    public static void main(String args[])
    {
        int n=5;
        int m=10;
        for(int i=1; i<n;i++)
        {
            for(int j=1; j<n-i; j++)
            {
                //print space
                    System.out.print(" ");
            }
               for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
    

