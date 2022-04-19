package br.com.araujo.escola;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldNotCreateEmailWithInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> new Email(null));
        assertThrows(IllegalArgumentException.class, () -> new Email(""));
        assertThrows(IllegalArgumentException.class, () -> new Email("email invalido"));
    }

}