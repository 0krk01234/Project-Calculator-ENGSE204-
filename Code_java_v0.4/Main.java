import java.util.Scanner;

public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        
        Display.Interface() ;

        Display.InitNum() ;
        double initNum = input.nextDouble() ;

        input.nextLine(); //clear buffer

        Operator op = new Operator(initNum) ; //

        boolean check = true ;
        //----------loop-------------
        while (check) {

            Display.OperatorList() ;
            String op_val = input.nextLine() ;
            
            if (op_val.contains("=")) break ; //chek if "="  exit loop
            
            Display.nextNum() ; //input new number
            double nextNum = input.nextDouble() ;
            input.nextLine(); //clear buffer
            
            op.calculator(op_val, nextNum) ;
            
        }
        System.out.println("Final result : " + op.Result()) ;
        
        input.close();
    }
}


