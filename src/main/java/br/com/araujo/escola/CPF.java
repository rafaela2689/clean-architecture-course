package br.com.araujo.escola;

public class CPF {
    private String number;

    private static final String CPF_PATTERN = "\\\\d{3}\\\\.\\\\d{3}\\\\.\\\\d{3}\\\\-\\\\d{2}";

    public CPF(String number) {
        if (number == null || !number.matches(CPF_PATTERN)) {
            throw new IllegalArgumentException("Invalid CPF");
        }
        this.number = number;
    }
}
