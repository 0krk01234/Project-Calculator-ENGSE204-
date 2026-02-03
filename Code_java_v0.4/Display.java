class Display {
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

    public static void InitNum() {
        System.out.print("Enter initial number : ");
    }

    public static void nextNum() {
        System.out.print("Enter next number : ");
    }

    public static void OperatorList() {
        System.out.print("Enter operator (+,-,*,/,%), type '=' to get result and stop process : ");
    }
}