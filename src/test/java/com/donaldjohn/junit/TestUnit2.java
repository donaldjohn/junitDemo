package com.donaldjohn.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class TestUnit2
{
    String message = "Reboert";
    MessageUtil messageUtils = new MessageUtil(message);

    @Test
    public void testPrintMessage()
    {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi," + message;
        assertEquals(message, messageUtils.salutationMessage());
    }
}
