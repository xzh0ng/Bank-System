package com.bank.exceptions;

public class InteractionException extends Exception {

  /**
   * set the UID of the InteractionException exception.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Initialize the interaction exception.
   */
  public InteractionException() {
  }

  /**
   * Initialize the exception to let it be able to contain hint word.
   * @param message string the error message of the exception
   */
  public InteractionException(String message) {
    super(message);
  }

  /**
   * This is automatically generated by the eclipse.
   * 
   * @param cause super class of the exception
   */
  public InteractionException(Throwable cause) {
    super(cause);
  }

  /**
   * This is automatically generated by the eclipse.
   * 
   * @param message error message
   * @param cause super class of the exception
   */
  public InteractionException(String message, Throwable cause) {
    super(message, cause);

  }

  /**
   * This is automatically generated by the eclipse.
   * 
   * @param message error message
   * @param cause super class of the exception
   * @param enableSuppression determines whether or not suppression is enabled
   * @param writableStackTrace the trace of the error
   */
  public InteractionException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);

  }

}
