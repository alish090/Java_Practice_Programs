import java.util.Scanner;

public class Switchexample {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int btn = sc.nextInt();

        switch(btn){
    
            case 1:
            System.out.println("Hello");
            break;
       
            case 2:
            System.out.println("Namaste");
            break;
        
            case 3:
            System.out.println("Welcome");
            break;
        
            default:
            System.out.println("Error");
        }
    }
    
}
