package com.donaldjohn.junit;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class TestJUnit2 extends TestCase
{
    protected double fValue1;
    protected double fValue2;

    @Override
    protected void setUp() throws Exception
    {
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Override
    protected void tearDown() throws Exception
    {
        super.tearDown();
    }

    @Test
    public void testAdd()
    {
        System.out.println("No. of the test: " + countTestCases());
        String name = getName();
        System.out.println("The test name is :" + name);

        setName("New test name");
        System.out.println("The test new name is :" + getName());


    }

}
