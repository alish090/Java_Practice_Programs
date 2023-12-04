public class Reverse_Half_Pyramid {

    public static void main(String args[]){
        
        for(int i=1;i<=5;i++)
        {
            //Print space
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            //print star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
                System.out.println();
        }
    
    }
    
}
