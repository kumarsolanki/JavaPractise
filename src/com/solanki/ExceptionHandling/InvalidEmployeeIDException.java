package com.solanki.ExceptionHandling;

 public class InvalidEmployeeIDException extends  Exception {
    public InvalidEmployeeIDException(String message) {
        super(message);
    }

    public InvalidEmployeeIDException(String message, Throwable cause) {
        super(message, cause);
    }
}
