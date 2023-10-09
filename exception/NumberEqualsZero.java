package exception;

public class NumberEqualsZero extends RuntimeException{

    public NumberEqualsZero(int num){
        super("The number added is equal to" + num);
    }


}
