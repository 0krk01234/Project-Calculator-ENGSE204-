package CalBasicLogicalThinking.CodeJava;

public class Display {
    public static void Interface(double result) { //เเสดงผลลัพธ์เป็นรูปเครื่องคิดเลข
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

    public static void displayOperatorList() {
        System.out.print("Enter operator (+,-,*,/,%), type '=' to get result and stop process : ");
    }

    public static void InitNum() {
        System.out.print("Enter equation : ") ;
    }

    public static void DisplayNextNum() {
        System.out.print("Enter next number : ");
    }
}
