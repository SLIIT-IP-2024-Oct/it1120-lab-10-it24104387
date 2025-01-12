import java.util.Scanner;



public class It24104387lab10Q1B{
    public static String  checkvalodate(double mark){
        if(mark<=100){
            return "Mark is Validated";
        }
        else{
            return "Invalid Mark";
            
        }
    }

    public static String chechgarde(double mark){
         if (mark <=0 ||mark<=100) {
            if(mark>=75){
            return "A";
            } else if (mark >= 60) {
            return "B";
             } else if (mark >= 50) {
            return "C";
            } else {
            return "F";
            }

         }
         else{
            return "Erro !";
         }
    }


    public static void main (String [] args){
    
        Scanner input = new Scanner(System.in);
        double mark;

        System.out.print("Enter your mark (0-100):");
        mark=input.nextDouble();

        String valid = checkvalodate(mark);
        String garde = chechgarde(mark);

        System.out.println(valid);
        System.out.println("The Grade for the Entered Mark is : "  +garde);
    



    }




}