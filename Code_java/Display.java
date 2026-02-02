package Code_java;
import java.util.ArrayList;

public class Display {
    public static void Interface() {
        System.out.println(" _____________________ ");
        System.out.println("|  _________________  |");
        System.out.println("| |               0 | |");
        System.out.println("| |_________________| |");
        System.out.println("|  ___ ___ ___   ___  |");
        System.out.println("| | 7 | 8 | 9 | | + | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 4 | 5 | 6 | | - | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 1 | 2 | 3 | | x | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | . | 0 | = | | / | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("|_____________________|");
    }

    public static void DisplayNumber(ArrayList<Double> num) {
        System.out.println("Numbers: " + num);
    }

    public static void DisplayOperator(ArrayList<Character> op) {
        System.out.println("Operators: " + op) ;
    }

}
