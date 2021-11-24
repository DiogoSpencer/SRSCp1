

public class WrongDigestException extends Exception{

    public WrongDigestException(){

    }

    public WrongDigestException(String message, Throwable throwable){
        super(message, throwable);
    }
}
