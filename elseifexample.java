import java.util.Scanner;

public class elseifexample {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if(marks >= 60){

            System.out.println("Distinction");
        }
        else if(marks>=50){
            System.out.println("First Class");
        }
        else if(marks>=40){
            System.out.println("Pass");
        }

    else{
        System.out.println("Fail");
    }
    
}
}
