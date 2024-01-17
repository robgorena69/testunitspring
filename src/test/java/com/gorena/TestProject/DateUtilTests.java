package com.gorena.TestProject;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DateUtilTests {

    

    @Test
    void verficaBisiestoYearDivisible400() {

        assertTrue(DateUtil.isLeapYear(400));
        assertTrue(DateUtil.isLeapYear(800));
        assertTrue(DateUtil.isLeapYear(2020));
        assertTrue(DateUtil.isLeapYear(2024));

        assertThat(DateUtil.isLeapYear(2004)).isTrue();
        assertThat(DateUtil.isLeapYear(2008)).isTrue();
        assertThat(DateUtil.isLeapYear(2012)).isTrue();
        assertThat(DateUtil.isLeapYear(2016)).isTrue();  

    }

    @Test
    void returnFalseYearDivisibleBy100ButNot400(){
        assertThat(DateUtil.isLeapYear(1700)).isFalse();
        assertThat(DateUtil.isLeapYear(1800)).isFalse();
        assertThat(DateUtil.isLeapYear(1900)).isFalse();
    }


    @Test
    void returnTrueYearDivisibleBy4ButNotBy100(){
        assertTrue(DateUtil.isLeapYear(1996));
        assertTrue(DateUtil.isLeapYear(2004));
        assertTrue(DateUtil.isLeapYear(2008));
    }

    @Test
    void returnFalseYearNoDivisibleBy4(){
        assertFalse(DateUtil.isLeapYear(2017));
        assertFalse(DateUtil.isLeapYear(2018));
        assertFalse(DateUtil.isLeapYear(2019));
    }


}
