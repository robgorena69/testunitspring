package com.gorena.TestProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilTests {


    @Test
    void verificaPasswordDebil() {

        assertEquals(SecurityLevel.DEBIL, PasswordUtil.verificaPassword("password"));

    }

    @Test
    void verificaPasswordMedio() {

        assertEquals(SecurityLevel.MEDIO, PasswordUtil.verificaPassword("password1233"));

    }

    @Test
    void verificaPassworFuerte() {
        assertEquals(SecurityLevel.FUERTE, PasswordUtil.verificaPassword("password123#"));

    }
}
