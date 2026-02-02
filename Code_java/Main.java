package Code_java ;
import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        try {
            Display.InitNum();
            String textcal = input.nextLine() ;
            Calculator cal = new Calculator(textcal) ;
            cal.getresult() ;
            Display.DisplayNumber(cal.getNumber() ) ;
            Display.DisplayOperator(cal.getOperators() ) ;
            Display.DisplayResult(cal.getText(), cal.getResultCAL());
            Display.Interface(cal.getResultCAL());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() ) ;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() ) ;
        } catch (Exception e) {
            Display.DisplayError();
        } finally {
            input.close() ;
        }
    }
}