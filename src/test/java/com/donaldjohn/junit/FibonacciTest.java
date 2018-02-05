package com.donaldjohn.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by donaldjohn on 2/4/18.
 */
@RunWith(Parameterized.class)
public class FibonacciTest
{
    public int num;
    public int result;

    public FibonacciTest(int num, int result)
    {
        this.num = num;
        this.result = result;
    }

    @Parameterized.Parameters(name = "{index} : fib({0})={1}")
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]{{0,0},{1,1}, {2,1}, {3,2} });
    }


    @Test
    public void test()
    {
        org.junit.Assert.assertEquals(result, Fibonacci.compute(num));
    }
}
