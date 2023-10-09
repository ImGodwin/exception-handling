package exception;

public class NumberEqualsZero extends RuntimeException{

    public NumberEqualsZero(int num){
        super("The " + num + " number added is equal to zero");
    }
}
