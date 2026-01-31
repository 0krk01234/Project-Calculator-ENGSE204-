import java.util.Scanner;

public class Display {
    private double result = 0;
    
    public void Interface() {
        System.out.println("Enter 0-9 to Add Number");
        System.out.println("Enter (+ - * / %) to Operator ");
    }

    public void DisplayResult() {
        System.out.println("= " + this.result);
    }
}
