package br.com.alura.screenmatch.excessao;

public class ErrorDeConversaoDeAnaException extends RuntimeException {
    private String message;

    public ErrorDeConversaoDeAnaException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
