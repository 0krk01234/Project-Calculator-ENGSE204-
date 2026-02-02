package Code_java ;
import java.util.ArrayList ;

public class Calculator {
    private String textCalculate ;
    private double resultCAL = 0.0f ; //final result 
    private ArrayList<Double> numbers = new ArrayList<>() ; 
    private ArrayList<Character> operators = new ArrayList<>() ; 

    public Calculator(String textCalculate) { //construct 
        this.textCalculate = textCalculate;
    }

    public double getResultCAL () {
        return resultCAL ; 
    }

    public ArrayList<Double> getNumber() {
        return numbers;
    }

    public ArrayList<Character> getOperators() {
        return operators;
    }

    public void getresult() {
        String text = this.textCalculate.replaceAll(" ", "") ;
        
        String holderNum = "" ; 

        for (int i = 0 ; i < text.length() ; i++) {
            char c = text.charAt(i) ;
            if ( c == '-' && (i == 0 || !Character.isDigit( text.charAt(i-1) ) ) ) { //case nigga-tive numbers in index [0] or index[i-1] is not digit
                holderNum += c ;  
            }
            else if (Character.isDigit(c) || c == '.' ) {
                holderNum += c ;  
            } else {
                numbers.add(Double.parseDouble(holderNum) ) ; 
                holderNum = "" ; //reset
                operators.add(c) ; 
            }
        }
        numbers.add(Double.parseDouble(holderNum)) ; 

        // ( * , / , % )
        for (int i = 0 ; i < operators.size() ; i ++ ) {
            char opera = operators.get(i) ;

            if (opera == '*' || opera == '/' || opera == '%' ) { 
                // [0 , 1 ,2 ] numF = 1 , numS = 2 user two numbers in one equation ----> then instead of them (0?1) [ (0?1)  ,        ,  2  ]
                double Fnum =  numbers.get(i) ;                                                                  //   instead   remove
                double Snum =  numbers.get(i+1) ;
                double result = 0.0f ;

                switch (opera) {
                    case '*' :
                        result = Fnum * Snum ;
                        break ;

                    case '/' :
                        result = Fnum / Snum ;
                        break ;

                    case '%' :
                        result = Fnum % Snum ;
                        break ;

                    default:
                        System.out.println("Error : Invalid equation!!!");
                        break;
                }
                numbers.set(i , result ) ;
                numbers.remove( i + 1) ;
                operators.remove(i) ;
                i-- ; //i = constance
            }
        }
        //( + , - )
        resultCAL = numbers.get(0) ;
        for (int i = 0 ; i < operators.size() ; i ++ ) {
            char opera = operators.get(i) ;
            double nextNum = numbers.get(i+1) ; 

            if (opera == '+' ) {
                resultCAL += nextNum ; 
            } else if (opera == '-' ) {
                resultCAL -= nextNum ;
            }
        }
    }
}
