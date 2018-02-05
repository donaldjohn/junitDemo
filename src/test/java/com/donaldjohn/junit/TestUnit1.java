package com.donaldjohn.junit;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class TestUnit1
{
    String message = "Reboert";
    MessageUtil messageUtils = new MessageUtil(message);

    @Test
    public void testPrintMessage()
    {
        System.out.println("Inside testPrintMessage()");

        assertEquals("Reboert", messageUtils.printMessage());
    }
}
