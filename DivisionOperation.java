import java.util.Scanner;

public class DivisionOperation {
    static void performDivision(int numerator,int denominator){
            if(denominator==0){
                throw new ArithmeticException("Division by Zero");
            }else {
                System.out.println(numerator/denominator);
            }

    }
    static void calculate(int numerator,int denominator){
        try{
            performDivision(numerator,denominator);
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scannerobject=new Scanner(System.in);
        int number1=scannerobject.nextInt();
        int number2=scannerobject.nextInt();
        try{
            calculate(number1,number2);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
