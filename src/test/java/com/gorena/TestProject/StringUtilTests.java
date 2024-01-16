package com.gorena.TestProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class StringUtilTests {

    @Test
    void testRepeat() {

    // Caso de prueba 1: Cadena vacía
    String result1 = StringUtil.repeat("", 3);
    assertEquals("---", result1);

    // Caso de prueba 2: Repetir cadena una vez
    String result2 = StringUtil.repeat("Hola", 1);
    assertEquals("Hola-", result2);

    // Caso de prueba 3: Repetir cadena varias veces
    String result3 = StringUtil.repeat("Java", 5);
    assertEquals("Java-Java-Java-Java-Java-", result3);
        //   
    }
}
