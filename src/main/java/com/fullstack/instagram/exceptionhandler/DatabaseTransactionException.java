package com.fullstack.instagram.exceptionhandler;

public class DatabaseTransactionException extends RuntimeException {

   public DatabaseTransactionException(String message, Throwable cause) {
      super(message);
      super.initCause(cause);
   }
}
