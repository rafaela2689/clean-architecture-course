package br.com.araujo.escola;

public class Email {
    private String endereco;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$";

    public Email(String endereco) {
        if (endereco == null || !endereco.matches(EMAIL_PATTERN)) {
            throw new IllegalArgumentException("Invalid email");
        }
        this.endereco = endereco;
    }
}
