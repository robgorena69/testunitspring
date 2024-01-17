package com.gorena.TestProject;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTests {
    @Test
    void verificaNumeroDivisibleX3() 
    {  
        assertThat(FizzBuzz.fizzBuzz(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.fizzBuzz(6)).isEqualTo("Fizz");
         
    }

    @Test
    void verificaNumeroDivisibleX5() 
    {        
        assertThat(FizzBuzz.fizzBuzz(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.fizzBuzz(10)).isEqualTo("Buzz");
         
    }

    @Test
    void verificaNumeroDivisibleX3yX5() 
    {        
        assertThat(FizzBuzz.fizzBuzz(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.fizzBuzz(30)).isEqualTo("FizzBuzz");
         
    }

    @Test
    void verificaNumeroNoDivisibl() 
    {        
        assertThat(FizzBuzz.fizzBuzz(2)).isEqualTo("2");
        assertThat(FizzBuzz.fizzBuzz(16)).isEqualTo("16");
        
    }

    @Test
    void verificaNumerosDivisibls() 
    {        
        assertThat(FizzBuzz.fizzBuzz(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.fizzBuzz(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.fizzBuzz(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.fizzBuzz(2)).isEqualTo("2");
        assertThat(FizzBuzz.fizzBuzz(16)).isEqualTo("16");
        
    }
}