package com.donaldjohn.junit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by donaldjohn on 2/3/18.
 */
public class TestJUnit
{
    @Test
    public void testHello()
    {
        String greeting = "hello";
        assertEquals(greeting, "hell0o");
    }
}
