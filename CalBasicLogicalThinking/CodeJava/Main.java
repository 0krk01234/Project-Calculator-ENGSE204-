package CalBasicLogicalThinking.CodeJava;
import java.util.Scanner;
public class Main {
    public static void main(String[ ] args) {
        Scanner input = new Scanner(System.in);
        

        Display.InitNum() ;
        double initNum = input.nextDouble() ;

        input.nextLine(); //clear buffer

        Operator op = new Operator(initNum) ; //

        boolean check = true ;
        //----------loop-------------
        while (check) {

            Display.displayOperatorList() ;
            String op_val = input.nextLine() ;
            
            if (op_val.contains("=")) break ; //chek if "="  exit loop
            
            Display.DisplayNextNum() ; //input new number
            double nextNum = input.nextDouble() ;
            input.nextLine(); //clear buffer
            
            op.calculator(op_val, nextNum) ;
            
        }

        Display.Interface(op.Result());
        
        input.close();
    }
}


