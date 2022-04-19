package br.com.araujo.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void shouldNotCreateCPFWithInvalidNumber() {
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF(""));
        assertThrows(IllegalArgumentException.class, () -> new CPF("cpf invalido"));
    }
}