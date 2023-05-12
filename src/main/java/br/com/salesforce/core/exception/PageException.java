package br.com.salesforce.core.exception;

public class PageException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public PageException(String string) {
        super(string);
    }

    public PageException(Throwable e) {
        super(e);
    }
}
