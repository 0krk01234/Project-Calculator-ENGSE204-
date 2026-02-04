package CalBasicLogicalThinking.CodeJava;
public class Operator { 
    private double Result;

    public Operator(double firstNumber) {
        
        if (Double.isNaN(firstNumber)){
            throw new IllegalArgumentException("ค่าแรกต้องเป็นตัวเลขเท่านั้น");
        }

        this.Result = firstNumber;
    }

    public double calculator(String Operator, double secondNumber) {

        if (Operator == null || Operator.length() != 1 ) {
            throw new IllegalArgumentException("Error: Operator ต้องเป็น +, -, *, /, % เท่านั้น");
        }

        switch (Operator) {

            case "+":
                this.Result += secondNumber;
                break;

            case "-":
                this.Result -= secondNumber;
                break;

            case "*":
                this.Result *= secondNumber;
                break;

            case "/":
                if (secondNumber == 0) {
                    throw new ArithmeticException("Error: ไม่สามารถหารด้วยศูนย์ได้");
                }

                this.Result /= secondNumber;
                break;
        }
        return this.Result;
    }

    public double Result() {
        return this.Result;
    }
}

