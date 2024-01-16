package com.gorena.TestProject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.catalina.realm.JAASCallbackHandler;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class PlayerTests {

    @Test
    void pierdeDadoEsNumeroBajo() {

        Dice dado = Mockito.mock(Dice.class);
        Mockito.when(dado.roll()).thenReturn(4);
        
        Player jugador = new Player(dado, 5);
        assertFalse(jugador.jugar());

    }

    @Test
    void ganaDadoEsNumeroAlto() {

        Dice dado = Mockito.mock(Dice.class);
        Mockito.when(dado.roll()).thenReturn(6);
        
        Player jugador = new Player(dado, 5);
        assertTrue(jugador.jugar());

    }
}
