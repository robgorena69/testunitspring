package com.gorena.TestProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



public class StringUtilTests {

    @Test
    void repiteCadenaVacia() {

        // Caso de prueba 1: Cadena vacía
        String result1 = StringUtil.repeat("", 3);
        assertEquals("---", result1);
    }

    @Test
    void repiteNveces(){
        String result2 = StringUtil.repeat("Hola", 1);
        assertEquals("Hola-", result2);
    }

    @Test
    void repiteUnaVez(){
        String result1 = StringUtil.repeat("Pedro", 1);
        assertEquals("Pedro-", result1);
    }

    //
    @Test
    void repiteArgumentosInvalidos(){
        assertThrows(IllegalArgumentException.class, () -> {
            StringUtil.repeat("Pedro", -5);
        });
    }

}
