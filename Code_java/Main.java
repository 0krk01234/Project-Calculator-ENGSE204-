package Code_java ;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        Display.Interface() ;
        try {
            System.out.print("Enter equation : ") ;
            String textcal = input.nextLine() ;
            Calculator cal = new Calculator(textcal) ;
            cal.getresult() ;
            Display.DisplayNumber(cal.getNumber() ) ;
            Display.DisplayOperator(cal.getOperators() ) ;
            System.out.println("Result of "+ cal.getText() + " = " + cal.getResultCAL() ) ;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() ) ;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() ) ;
        } catch (Exception e) {
            System.out.println("Error : Something went wrong") ;
        } finally {
            input.close() ;
        }
    }
}