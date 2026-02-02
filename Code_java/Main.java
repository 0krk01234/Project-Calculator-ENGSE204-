package Code_java ;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        
        String textcal = input.nextLine() ;
        Calculator cal = new Calculator(textcal) ;
        cal.getresult() ;
        Display.DisplayNumber(cal.getNumber());
        Display.DisplayOperator(cal.getOperators());
        System.out.println("= " + cal.getResultCAL());
        input.close() ;
    }
}