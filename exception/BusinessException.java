package exception;

public class BusinessException extends RuntimeException {
    static final long serialVersionUID = 1L;

    public BusinessException(String msg) {
        super(msg);
    }
}
