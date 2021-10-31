package com.Happiest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PracticeTest {

    @Test
    public void WhenGivenToIntegers_AddThem_ShouldReturnSum(){
        int input =5;
        int input1=4;
        int expected=9;

        int actual = Practice.add(input,input1);
        Assertions.assertEquals(actual,expected);
    }
}
