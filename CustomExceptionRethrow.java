import javax.naming.LimitExceededException;
import java.util.Scanner;
class LimitExceedCustomException extends Exception{
    LimitExceedCustomException(String string){
        super(string);
    }
}
public class CustomExceptionRethrow {
    static int performAddition(int number1,int number2) throws LimitExceedCustomException {
        if(number1+number2>10)
            throw new LimitExceedCustomException("Limit exceeded");
        else return number2+number1;
    }
    static void calculate(int number1,int number2) throws LimitExceedCustomException {
        try{
            performAddition(number1,number2);

        }catch (LimitExceedCustomException e){
            throw new LimitExceedCustomException("Limit exceeded");
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println("Enter two numbers");
            Scanner scannerobject=new Scanner(System.in);
            int number1=scannerobject.nextInt();
            int number2=scannerobject.nextInt();
            calculate(number1,number2);
        }catch (LimitExceedCustomException e){
            System.out.println(e);
        }
    }
}
