import java.util.Scanner;



public class It24104387lab10Q1A{
    public static String  checkvalodate(double mark){
        if(mark<=100){
            return "Mark is Validated";
        }
        else{
            return " Invalid Mark";
        }
    }

    public static void main (String [] args){
    
        Scanner input = new Scanner(System.in);
        double mark;

        System.out.print("Enter your mark (0-100):");
        mark=input.nextDouble();

        String valid = checkvalodate(mark);

        System.out.print(valid);
    



    }




}