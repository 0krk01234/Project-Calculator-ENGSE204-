package CalStringToDouble.Code_java;
import java.util.ArrayList;

public class Display {
    public static void Interface(double result) {
        //แปลง double เป็น String
        String text = String.valueOf(result);
        int screenWidth = 15;


        //เมื่อตัวทิศนิยมยาวเกินหน้าจอ(screenWidth)ให้ตัดเลขทศนิยมนั้นทิ้ง
        if (text.length() > screenWidth) {
            text = text.substring(0, screenWidth);
        }

        String displayLine = String.format("%" + screenWidth + "s", text);

        System.out.println(" _____________________ ");
        System.out.println("|  _________________  |");
        System.out.println("| | " + displayLine + " | |");
        System.out.println("| |_________________| |");
        System.out.println("|  ___ ___ ___   ___  |");
        System.out.println("| | 7 | 8 | 9 | | % | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 4 | 5 | 6 | | / | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | 1 | 2 | 3 | | x | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | . | 0 | = | | - | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("|               | + | |");
        System.out.println("|               |___| |");
        System.out.println("|_____________________|");
    }

    public static void DisplayNumber(ArrayList<Double> num) { //เเสดงตัวเลข
        System.out.println("Numbers: " + num);
    }

    public static void DisplayOperator(ArrayList<Character> op) { //เเสดงตัวดำเนินการ
        System.out.println("Operators: " + op) ;
    }

    public static void InitNum() {
        System.out.print("Enter equation : ") ;
    }

    public static void DisplayResult(String text, double result) { //เเสดงผลลัพธิ์
        System.out.println("Result of "+ text + " = " + result ) ;
    }

    public static void DisplayError() {
        System.out.println("Error : Something went wrong") ;
    }
}
