import java.util.Scanner;

public class if_else_example {

    public static void main(String args[])
    {
          int sum =0, R, temp;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
      
        temp = num;

       while(num != 0)
    {
            R = num % 10;
            sum = sum * R * R * R;
            num = num /10;
    }
    if(sum == num)
    {
        System.out.println("Armstrong");
    }
    else
    {
        System.out.println("No Armstrong sum");
    }
        
    
    }
    
}
